<div align="center">

# TRACE

### Cinematic music, quietly.

A dark-first, minimal music player for Android. Search real music, stream it in
the background, and let the interface tint itself from the artwork.

</div>

---

## About TRACE

TRACE is a focused reimagining of the streaming and playback engine behind
[Vivi Music](https://github.com/vivizzz007/vivi-music). The extraction pipeline,
Media3/ExoPlayer integration, background playback and queue persistence are the
proven upstream implementations; everything you *see* — the navigation shell,
theme, screens and branding — is new.

- **Search that keeps up with you.** Results are fetched while you type (debounced,
  last-write-wins, no request storms), so the list follows the letters instead of
  waiting for the keyboard's Search key. Only queries you submit are saved to
  "Recent", so history stays readable.
- **Listen Together.** Create a room, share its code, and everyone hears the same
  track at the same second: the host's play/pause, skips and seeks are broadcast,
  guests follow, and a five-second position beat corrects drift. The room has its
  own chat with **text, voice notes and photos**. Only metadata (title, artist,
  duration, artwork URL) is sent — every device resolves the audio itself, so no
  stream URL is ever shared. Rooms close when everyone leaves.
- **Playlists that actually create.** "New playlist" now writes the playlist row
  before its first song, which is what the foreign key demands — it used to fail
  with a constraint error.
- **Dark-first, cinematic UI.** A calm, minimal surface that puts artwork and
  typography first. No clone of any other player.
- **A theme studio.** Twelve ready themes plus a builder that hands over the four
  colours every look is made of — accent, background, surface, text — with full
  hue/saturation/lightness control, live preview and locally stored custom themes.
- **Three appearances.** Switch the whole interface between **Normal**, an
  **Apple Music-inspired** look (near-black or warm-white surfaces, a restrained
  red/pink accent, larger artwork, softer corners) and **Liquid Glass** —
  translucent panes with a diagonal specular sheen and a lit gradient rim, over a
  tinted backdrop. Glass keeps whichever accent or saved palette you already use:
  it replaces the *material*, not the theme. All three are a single design-token
  swap over the same screens, so playback never restarts and nothing is recreated.
  (Honest note: Compose cannot blur a *backdrop*, so the glass is built from
  translucency, a sheen, a lit rim and a contrasting backdrop rather than a real
  Gaussian blur — see `ui/components/TraceGlass.kt`.)
- **Swipe between tabs.** Home, Search, Library and Menu are pages of a pager: a
  sideways swipe moves between them, and a tab tap animates to the same page. The
  two are kept in sync through one list, so they cannot fight. A pushed screen
  (album, settings, &c.) disables the gesture and renders above the pager.
- **Swipe the player.** Swipe the artwork left or right — or the mini player bar —
  to go to the next or previous track. The cover follows the finger, fades, and
  shows a "Next"/"Previous" label, and only a deliberate swipe past the threshold
  fires.
- **Swipe shortcuts.** Swipe any song row right to play it next, left to add it to
  the queue.
- **New-player stage.** The full player is a single column: a centred title bar
  with a real output-device picker, the cover bleeding its colours into the
  backdrop, the title and artist with round overflow / like keys, a thick
  draggable seek bar, three large transport glyphs, the current output as a
  tappable chip and a bottom bar (queue · shuffle · repeat · sleep timer · lyrics).
  There is no volume slider: the hardware volume keys already control the stream,
  and the space went to the artwork.
- **Shelves, not stacks.** Home renders every feed section as one scrollable row —
  square covers for tracks, overlay tiles for albums/artists/playlists — so a
  section costs the same height whether it holds six items or sixty. Two personal
  shelves sit on top: "Jump back in" from listening history, and **"More like
  <your last song>"**, seeded from that video's watch-next radio.
- **Menu — offline.** A fourth tab listing everything the app can play with no
  network: songs you have played through (kept in the player cache) plus anything
  you downloaded (pinned in the download cache). Badges say which is which, and
  the header reports real bytes on disk.
- **Extreme audio quality.** Beyond High, Extreme asks the extractor for the
  highest-bitrate format it has, pins the track selector to the highest-supported
  bitrate and switches the audio sink to float PCM with offload off. It is labelled
  honestly: YouTube Music's ceiling is ~256 kbps AAC, so this is the maximum the
  source can give, not 24-bit/192 kHz lossless.
- **A Developer page.** Settings → About → Developer: a small portrait, a short
  bio, and links to Instagram and GitHub.
- **Grouped lists.** Library leads with a search pill, filter chips and a grid of
  big tiles; Settings is a stack of raised cards.
- **Real playback.** Real search against YouTube Music, real audio resolution,
  background playback with lock-screen and Bluetooth controls, audio focus and
  queue persistence.
- **Resilient streaming.** Stream URLs are resolved lazily right before playback
  and re-resolved on expiry without restarting the queue.
- **Privacy-first.** Media metadata is cached locally in Room; temporary stream
  URLs are never persisted. No ads, no trackers, no analytics.
- **Tell-me-when-it's-new.** Point TRACE at a JSON release feed and it checks once
  per launch: a notification plus a changelog dialog listing every new feature, then
  one tap hands the download to Android's installer. Nothing is fetched when the
  feed URL is left blank. See [`docs/UPDATES.md`](docs/UPDATES.md).
- **GPL-3.0.** TRACE is free software and publishes its complete source.

### Screens

Four tabs — **Home**, **Search**, **Library** and **Menu** (offline) — with a
persistent mini-player above the bottom bar and a shuffle key in the Home header.
Settings is one tap away from the brand header on every tab. The full player, queue
and lyrics open as overlays. Album, Artist and Playlist screens are reachable from
cards and are deep-link friendly. Settings → Appearance hosts the **appearance
picker** (Normal / Apple-Inspired / Liquid Glass), the theme chooser and **Theme
studio**; Settings → Audio carries **Audio quality** (Auto / High / Extreme / Low);
Settings → Together carries **Listen Together**; Settings → About carries
**Developer**, **Check for updates** and the licences.
Settings → Support carries **Report a bug** (Instagram `@abinavh.b`).

Listen Together is also one tap from the Home header (the people glyph) and is
documented in [`docs/LISTEN_TOGETHER.md`](docs/LISTEN_TOGETHER.md).

---

## Architecture

```
UI (Compose)
   │  TraceApp shell · screens · mini-player
   ▼
ViewModels
   │  Home · Search · Library · Detail · Lyrics
   ▼
MusicRepository ──────────────────────────────┐
   │                                          │
   ├── MusicSource  (YouTubeMusicSource)      │  StreamResolver
   │        · discovery via :innertube        │   · pre-flight / download /
   │                                          │     diagnostics resolution
   ▼                                          ▼
MediaMetadata / MediaItem  (ids only, no URLs)
   │
   ▼
MusicService (MediaSessionService)
   │   ResolvingDataSource  → resolves the real stream URL on demand
   ▼
InnerTubeXPlayer / YTPlayerUtils / innertubex  →  Media3 ExoPlayer
```

Key points:

- **No separate fake API.** Discovery uses the same `:innertube` client the
  upstream app uses; playback uses the same `InnerTubeXPlayer` extraction.
- **`MusicSource` / `StreamResolver` abstraction.** A clean seam so additional
  sources can be added later without touching the UI or the player.
- **Lazy resolution.** Queue items hold media *ids*, never URLs. The
  `ResolvingDataSource` resolves a fresh URL at the moment ExoPlayer needs it,
  and re-resolves on expiry while preserving position and the rest of the queue.
- **Single UI model.** Network items (`SongItem`/`YTItem`), local Room entities
  (`Song`/`Album`/`Artist`/`Playlist`) and the player (`MediaMetadata`) all
  convert to one `MediaTrack`/`MediaCard` pair.

---

## Building

Requirements: JDK 21, Android SDK with platform 37 and build-tools 37.0.0.

```bash
# Debug
./gradlew :app:assembleDebug

# Release (signed with keystore/Trace-release.keystore)
./gradlew :app:assembleRelease
```

Outputs:

- `app/build/outputs/apk/debug/app-debug.apk`
- `app/build/outputs/apk/release/app-release.apk`

### Configurable identity

App identity is overridable through Gradle properties (see `gradle.properties`):

```properties
Trace.appId=com.example.musicplayer
Trace.namespace=com.example.musicplayer
Trace.versionName=2.6.0
Trace.versionCode=10
Trace.updateFeedUrl=      # blank = the in-app update check is switched off
```

`Trace.updateFeedUrl` is baked in as `BuildConfig.UPDATE_FEED_URL`. See
[`docs/UPDATES.md`](docs/UPDATES.md) for the feed format and the release steps.

### Optional integrations

Last.fm scrobbling is optional. Provide keys via `local.properties` (or the
environment) to enable it; leave them blank to disable the integration:

```properties
LASTFM_API_KEY=...
LASTFM_SECRET=...
```

---

## Module graph

| Module | Purpose |
|---|---|
| `:app` | The TRACE application (new UI/UX + branding). |
| `:innertube` | YouTube / YouTube Music InnerTube discovery client (reused). |
| `:lyricsProvider` | Open-source lyrics providers (Musixmatch removed). |
| `:lastfm` | Last.fm scrobbling client (optional, reused). |

---

## Licensing

TRACE is licensed under **GPL-3.0-or-later**. It is a derivative of Vivi Music
6.0.8 and preserves all upstream notices.

See [`THIRD_PARTY_LICENSES.md`](THIRD_PARTY_LICENSES.md) for the complete list, or
open **Settings → Open-source licences** inside the app.

Proprietary upstream modules (Musixmatch, JioSaavn, Kizzy/Discord RPC) are **not**
included.
