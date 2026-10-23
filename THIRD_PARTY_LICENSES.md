# Third-Party Licences and Attribution — TRACE Music Player

This document lists every third-party component that TRACE links against or
redistributes, together with its licence. It is the authoritative source that the
in-app **Settings → Open-source licences** screen mirrors.

TRACE is a **derivative work**. It reuses the streaming/playback architecture of
[Vivi Music](https://github.com/vivizzz007/vivi-music) 6.0.8, which is licensed
under the **GNU General Public License v3.0**. TRACE is therefore also released
under **GPL-3.0**, and the complete corresponding source of TRACE is published
under that same licence, exactly as the GPL requires.

---

## 1. The application itself

| Component | Licence | Notes |
|---|---|---|
| TRACE Music Player | **GPL-3.0-or-later** | This application. Copyright (C) 2026 TRACE contributors. |
| Vivi Music 6.0.8 (upstream) | **GPL-3.0** | Copyright (C) 2026. Streaming, playback and extraction architecture reused. |
| Derived file headers | **GPL-3.0** | Every Kotlin/Java source file derived from upstream keeps an "TRACE — derived from Vivi Music — GPL-3.0" header. |

The repository `LICENSE` file is the upstream GPL-3.0 text and is **preserved
verbatim** so the original notices travel with the code.

---

## 2. Reused in-repo modules (built from source in this project)

| Module | Licence | Purpose |
|---|---|---|
| `:innertube` | **GPL-3.0** | YouTube / YouTube Music InnerTube discovery client (search, home, album, artist, playlist, lyrics browse). |
| `:lyricsProvider` | **GPL-3.0** | Open-source lyrics providers. See per-provider breakdown below. |
| `:lastfm` | **GPL-3.0** | Last.fm scrobbling client (optional integration). |

---

## 3. Runtime dependencies (resolved from Maven / Google Maven / JitPack)

### AndroidX / Jetpack — Apache-2.0

| Artifact | Licence |
|---|---|
| `androidx.activity:activity-compose` | Apache-2.0 |
| `androidx.appcompat:appcompat` | Apache-2.0 |
| `androidx.core:core-splashscreen` | Apache-2.0 |
| `androidx.datastore:datastore-preferences` | Apache-2.0 |
| `androidx.lifecycle:lifecycle-viewmodel-ktx` / `-compose` | Apache-2.0 |
| `androidx.palette:palette-ktx` | Apache-2.0 |
| `androidx.media3:*` (exoplayer, session, exoplayer-hls, datasource-okhttp, ui) | Apache-2.0 |
| `androidx.room:*` (runtime, ktx, compiler) | Apache-2.0 |
| `androidx.concurrent:concurrent-futures-ktx` | Apache-2.0 |
| `androidx.hilt:hilt-navigation-compose` | Apache-2.0 |

### Jetpack Compose — Apache-2.0

| Artifact | Licence |
|---|---|
| `androidx.compose.runtime:runtime` | Apache-2.0 |
| `androidx.compose.foundation:foundation` | Apache-2.0 |
| `androidx.compose.ui:ui`, `ui-util`, `ui-tooling` | Apache-2.0 |
| `androidx.compose.animation:animation-graphics` | Apache-2.0 |
| `androidx.compose.material3:material3` | Apache-2.0 |
| `androidx.compose.material3.adaptive:*` | Apache-2.0 |
| `androidx.compose.material:material-icons-core` | Apache-2.0 |
| `androidx.compose.material:material-icons-extended` | Apache-2.0 |

### Other libraries

| Artifact | Licence | Purpose |
|---|---|---|
| `com.google.dagger:hilt-android` (+ compiler) | Apache-2.0 | Dependency injection |
| `com.google.guava:guava` | Apache-2.0 | Utility |
| `org.jetbrains.kotlinx:kotlinx-coroutines-*` | Apache-2.0 | Concurrency |
| `com.jakewharton.timber:timber` | Apache-2.0 | Logging |
| `io.coil-kt.coil3:coil-compose`, `coil-network-okhttp` | Apache-2.0 | Image loading |
| `com.squareup.okhttp3:okhttp` | Apache-2.0 | WebSocket transport for Listen Together |
| `io.ktor:ktor-client-*` | Apache-2.0 | HTTP client |
| `org.jsoup:jsoup` | MIT | HTML parsing |
| `org.apache.commons:commons-lang3` | Apache-2.0 | String/utility |
| `sh.calvin.reorderable:reorderable` | Apache-2.0 | Drag-to-reorder lists |
| `com.materialkolor:material-kolor` | MIT | Colour utilities (declared) |
| `com.valentinilk.shimmer:compose-shimmer` | Apache-2.0 | Shimmer placeholder (declared) |
| `com.github.racra:smooth-corner-rect-android-compose` (JitPack) | Apache-2.0 | Rounded artwork corners |
| `com.atilika.kuromoji:kuromoji-ipadic` | Apache-2.0 | Japanese tokenisation for lyrics |
| `com.github.promeG:tinypinyin` (JitPack) | Apache-2.0 | Chinese pinyin for lyrics sorting |
| `org.json:json` | JSON (public domain) | JSON parsing |

### Media extraction backends

| Artifact | Licence | Purpose |
|---|---|---|
| `com.github.TeamNewPipe:NewPipeExtractor` (JitPack) | **GPL-3.0** | Media extraction utilities used by the streaming pipeline. |
| `com.github.MetrolistGroup.innertubex:innertubex-android` (JitPack) | **GPL-3.0** | Stream URL extraction backend (`InnerTubeXPlayer`). |

> Because TRACE statically links GPL-3.0 libraries and is itself GPL-3.0, the
> combination is licence-compatible.

---

## 4. Lyrics providers (`:lyricsProvider`)

| Provider | Source of data | Licence of bundled client |
|---|---|---|
| LRCLIB | lrclib.net | MIT |
| Better Lyrics | BetterLyrics API | GPL-3.0 (bundled client) |
| KuGou | KuGou | client MIT |
| Unison | Unison API | MIT (client) |
| Bini | Bini API | MIT (client) |
| YouLyPlus | YouLyPlus API | MIT (client) |
| Paxsenix | Paxsenix API | MIT (client) |

Each provider talks to an external service. TRACE stores and displays the lyrics
returned by those services and reproduces them only for personal playback use.
All lyric providers can be individually disabled in **Settings → Lyrics
providers**; each is opt-out so that providers with restrictive terms can be
turned off.

---

## 5. Deliberately excluded upstream components

The following modules exist in the upstream project but are **not** included in
TRACE. They carry licence headers that forbid copying/reuse, or are otherwise
incompatible with a GPL-3.0 distribution:

| Upstream module | Reason for exclusion |
|---|---|
| `musixmatch` (`com.music.musixmatch`) | Proprietary. Header states the source may be inspected but **copying, reproducing, adapting, modifying or redistributing is prohibited** without the author's express permission. Not copied. |
| `jiosaavn` | Ships proprietary terms that prohibit reuse in other applications. Not copied. |
| `kizzy` (`com.my.kizzy`, Discord RPC) | Header states it "can not be copied and/or distributed without the express permission of yzziK (Vaibhav)". Discord Rich Presence was therefore removed entirely from TRACE. |
| `canvas`, `applecanvas`, `vivimusiccanvas` | Removed to reduce surface area; not required by playback. |
| `artistvideo`, `shazamkit`, `spotify` | Removed; separate licensing and not required. |
| Vivi updater / `NewReleaseCheckWorker` | Removed; TRACE ships its own release process. |
| Listen Together (social sync) | Removed; server-side service with unclear licensing and not required for playback. |
| Home-screen widgets | Removed; playback is unaffected. |
| Cast / MediaRouter / Google Play Services | Removed to keep the build free of proprietary GMS runtime dependencies. |

The upstream `LICENSE` "special exception for the Musixmatch module" paragraph is
retained verbatim in the preserved `LICENSE` file for attribution accuracy, but
**no Musixmatch code is present in TRACE**.

---

## 6. Compliance summary

* TRACE is licensed **GPL-3.0-or-later**; full source is published.
* All upstream GPL notices are preserved (repository `LICENSE`, per-file headers).
* No proprietary or "no-copy" module is included.
* No advertising, tracking or analytics SDK is included.
* No DRM circumvention: TRACE only resolves and plays publicly accessible streams.
* The in-app **Settings → Open-source licences** screen mirrors this document.

If you believe something here is inaccurate, please open an issue — attribution
accuracy is taken seriously.
