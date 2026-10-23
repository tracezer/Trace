It's the "What's new in this version" text that shows on the GitHub release page. People reading your repo will see it under the release title.

Here's a ready-to-paste version (taken from your updates.json):

TRACE 2.6.0

New
- Listen Together — create a room, share the code, and listen in sync with someone else.
- Room chat with text, voice notes and photos.
- Search results now update while you type; the list follows the letters.
- Creating a playlist no longer fails with a database constraint error.

Notes
- Only metadata is shared between listeners — each device resolves its own audio.
- Rooms close when everyone leaves; nothing is stored on the server.
You can also add a short intro line at the top like:

TRACE — a cinematic Android music player (VIVI-derived, GPL-3.0).
and paste the APK's SHA-256 at the bottom for verification:

SHA-256: a67bc6b36180fc4b129792e8968d8df6572a8816d162dc9beb82e8bd77309e15
That's all optional — the release page works fine with just a title and the attached APK. The description is purely for humans browsing the repo.

VIVI Music Banner
VIVI Music
More Than Just Music — Your Ultimate Audio Experience
Download Latest Downloads License Support on Ko-fi

vivizzz007%2Fvivi-music | Trendshift

vivizzz007%2Fvivi-music | Trendshift    vivizzz007%2Fvivi-music | Trendshift

🎵 About VIVI
✨ VIVI isn't just another music player — it's a premium, modern audio ecosystem engineered for listeners who demand more. Powered by a responsive design engine that dynamically matches your album art's color palette, VIVI completely shifts to match your aesthetic on every single beat.

From stunning animated canvas visualizers to fluid physics-based micro-animations, every interaction is crafted to elevate your listening. Stream ad-free, sync karaoke lyrics, share your sound instantly, and enjoy an elegant interface designed with modern Material 3 guidelines.

🎵 Your music, your aesthetic — only with VIVI.
🛡️ 100% Privacy-First
Completely local database. Absolutely zero trackers, analytics, or background telemetry.

🎨 Material You Engine
Stunning adaptive interface that dynamically morphs colors based on what's playing.

🚀 Ad-Free Streaming
Seamless background playback with high-fidelity streams from YouTube Music.

📸 Screenshots
Player

Player Screen 1	Player

Player Screen 2	Artist Screen

Artist Screen
Album Page

Album Page	Search Section

Search Section	Home Page

Home Page
Built-in Updater

Built-in Updater	Audio Control Section

Audio Control Section	
✨ Features
🎨 Expressive UI & Design
Dynamic Material You: Beautiful adaptive colors that shift to match your playing album art.
Premium Animations: Silky-smooth micro-animations and seamless screen transitions.
Modern Architecture: Sleek, modern layouts engineered with Android's latest Material 3 guidelines.
🎵 Advanced Streaming
Full Catalog Integration: Stream any song from YouTube and YT Music, completely ad-free.
Animated Canvas: Stunning Apple Music-style animated backdrops that bring music to life.
Background Playback: High-quality continuous playback with full notification drawer controls.
📝 Synced Lyrics & Audio
Karaoke Syncing: Beautiful, precise word-by-word highlighted lyrics.
Integrated EQ: High-fidelity audio customization with an in-app Equalizer.
📥 Offline Experience
Local Downloads: Download and cache tracks onto your device for offline enjoyment.
Smart Storage: Intelligent cache management that optimizes space automatically.
🔄 OTA Updater
Seamless Updates: Instant Over-the-Air updates directly inside the app.
Direct Delivery: Always stay ahead with instant feature upgrades and patch fixes.
🛡️ 100% Privacy
Zero Data Collection: No trackers, no telemetry, and no telemetry analytics.
Local Security: All user libraries, preferences, and downloaded tracks are stored locally.

💖 Support the Project
If you love VIVI Music and want to support its maintenance and active development, please consider buying me a coffee! Your support helps keep this premium audio experience completely active, clean, and ad-free.


Support on Ko-fi

🚗 Android Auto Setup
If VIVI Music doesn't appear in Android Auto:

Open Android Auto on your phone
Tap the hamburger menu (three lines) and go to Settings
Scroll to the bottom and tap the version number multiple times to enable Developer Settings
Tap the three dots menu (⋮) at the top-right
Select Developer settings
Enable Unknown sources
Restart Android Auto and connect to your car
🤝 Contributing
Contributions are welcome! Whether it's bug reports, feature requests, or code contributions:

Fork the repository
Create your feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request
🛡️ Privacy & Data Collection
At VIVI Music, your privacy is our top priority. We believe that your music and data belong exclusively to you.

Zero Data Collection: We do not collect, store, or share any of your personal information, usage habits, or listening history.
100% Local: All your settings, downloaded tracks, and offline caches are stored securely on your device.
No Tracking: There are no hidden trackers, analytics, or background services monitoring your activity.
Enjoy your music with complete peace of mind, knowing that your privacy is fully protected.

📜 Disclaimer
This project and its contents are not affiliated with, funded, authorized, endorsed by, or in any way associated with YouTube, Google LLC, or any of their affiliates and subsidiaries.

Any trademark, service mark, trade name, or other intellectual property rights used in this project are owned by their respective owners.

VIVI Music is an independent project created for educational and personal use purposes.

📄 License & Guidelines
This project is licensed under the terms specified in the LICENSE (GPL-3.0) file.

If you copy, adapt, or reuse any part of the source code, you must adhere to the guidelines outlined in the rules.md file.

🌐 Community & Support
Connect · Collaborate · Contribute


Channel	About	Action
✈️ Telegram	Chat with fellow music lovers, get support & stay updated	Telegram
🐛 Bug Reports	Found something broken? Help us fix it by opening a GitHub issue	Report Bug
💡 Discussions	Share ideas, request features & spark community conversations	Discussions
🙏 Special Thanks & Credits
VIVI Music is built upon the foundation of amazing open-source projects and developers:


💡 Special Thanks
Mostafa Alagamy – Creator of Metrolist, the project that inspired VIVI Music. Huge thanks for the foundation and open-source contributions! 🌟
@Zemer – Huge congratulations and thanks for inventing the new playback method! 🎉
🎖️ Foundational Projects
AM-Lyrics – For the powerful synced TTML lyrics integration from Binimum.
Better Lyrics – For beautiful synced lyrics and YouTube Music integration.
YouLyPlus – For smooth in-app lyrics styling.
Unison – For the premium Apple Music-style visualizer canvas.
SponsorBlock – For automatic skipping of sponsored and non-music segments.

The open-source community for tools, libraries, and APIs that make this project possible.

Thank you to all the amazing developers who made this project possible!

Made with ❤️ for music lovers everywhere

⭐ Star this repo if you enjoy VIVI Music! (i also want this type )
Done — README.md rewritten in the VIVI Music style, but truthful to what TRACE actually is:

Centered banner with title/tagline and badges (License, Platform, Kotlin, minSdk)
About, Privacy-First, Theme Studio, Ad-Free Streaming sections
Screenshots table (placeholder images in docs/screenshots/ — swap in real captures)
Feature list grouped by UI / Streaming / Listen Together / Playlists / Search / Offline / Updater / Privacy
Android Auto setup, Contributing, Privacy, Disclaimer, License, Community & Support table, Credits, footer
A couple of things to fill in later:

Replace CHANGE-ME/TRACE in the Community links with your real username/TRACE.
Add real screenshots to docs/screenshots/ (player.png, home.png, search.png, library.png, together.png, settings.png).
Done — README.md is now in VIVI's style (centered banner, badges, two-column About table, screenshots table, feature tables, support box, Android Auto, contributing, privacy, disclaimer, license, community table, credits, footer) but branded for TRACE and listing only TRACE's real features.

The screenshots table points at docs/screenshots/*.png — drop your captures there with those names and they'll render. All CHANGE-ME/TRACE links need your real GitHub username once you create the repo.

change e
README.md
<div align="center">

# TRACE

### Cinematic music, quietly.

A dark-first, minimal music player for Android. Search real music, stream it in
the background, and let the interface tint itself from the artwork.

[![License: GPL-3.0](https://img.shields.io/badge/License-GPL--3.0-blue.svg)](LICENSE)
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)]()
[![Kotlin](https://img.shields.io/badge/Kotlin-2.3.10-purple.svg)]()
[![Min SDK](https://img.shields.io/badge/minSdk-26-orange.svg)]()

</div>

---

## 🎵 About TRACE

TRACE is a focused, cinematic music player for Android. It reuses the proven
streaming and playback engine behind [Vivi Music](https://github.com/vivizzz007/vivi-music)
— InnerTube discovery, Media3/ExoPlayer, background playback, queue persistence —
and replaces everything you *see* with a calm, dark-first interface: a navigation
shell, a theme studio, and a player built around the artwork.

Search real music, stream it ad-free, share a room and listen together, build
playlists that actually work, and let the UI tint itself from whatever is playing.

🎵 Your music, your aesthetic — only with TRACE.

## 🛡️ 100% Privacy-First

Completely local database. Absolutely zero trackers, analytics, or background
telemetry. Temporary stream URLs are never persisted.

## 🎨 Theme Studio

Twelve ready themes plus a builder that hands over the four colours every look is
made of — accent, background, surface, text — with full hue/saturation/lightness
control, live preview and locally stored custom themes. Three appearances on top:
**Normal**, **Apple-Inspired** and **Liquid Glass**.

## 🚀 Ad-Free Streaming

Seamless background playback with high-fidelity streams from YouTube Music.

---

## 📸 Screenshots

| Player | Home | Search |
|---|---|---|
| ![Player](docs/screenshots/player.png) | ![Home](docs/screenshots/home.png) | ![Search](docs/screenshots/search.png) |

| Library | Listen Together | Settings |
|---|---|---|
| ![Library](docs/screenshots/library.png) | ![Together](docs/screenshots/together.png) | ![Settings](docs/screenshots/settings.png) |

> Screenshots live in `docs/screenshots/`. Replace the placeholders with real
> captures when available.

---

## ✨ Features

### 🎨 Expressive UI & Design

- **Dark-first, cinematic.** A calm surface that puts artwork and typography first.
- **Three appearances.** Normal, Apple-Inspired (near-black / warm-white surfaces,
  restrained red/pink accent, larger artwork, softer corners) and Liquid Glass
  (translucent panes with a diagonal specular sheen and a lit gradient rim). All
  three are a single design-token swap — playback never restarts.
- **Theme studio.** Twelve ready themes plus a builder with full HSL control,
  live preview and locally stored custom themes.
- **Swipe between tabs.** Home, Search, Library and Menu are pages of a pager.
- **Swipe the player.** Swipe the artwork or the mini-player bar left/right to skip.
- **Swipe shortcuts.** Swipe a song row right to play it next, left to queue it.
- **Grouped lists.** Library leads with a search pill, filter chips and big tiles;
  Settings is a stack of raised cards.

### 🎵 Advanced Streaming

- **Full catalog.** Stream any song from YouTube Music, completely ad-free.
- **Background playback.** High-quality continuous playback with full notification
  drawer and lock-screen controls.
- **Extreme audio quality.** Beyond High: highest-bitrate format, highest-supported
  bitrate pinned, float PCM sink, offload off. Honestly labelled — YouTube Music's
  ceiling is ~256 kbps AAC.
- **Resilient streaming.** Stream URLs are resolved lazily right before playback
  and re-resolved on expiry without restarting the queue.

### 🎧 Listen Together

- **Create a room, share the code.** Everyone hears the same track at the same
  second: the host's play/pause, skips and seeks are broadcast, guests follow, and
  a five-second position beat corrects drift.
- **Room chat.** Text, voice notes and photos — all carried through the same
  string channel with a tiny self-describing envelope.
- **Privacy-preserving.** Only metadata (title, artist, duration, artwork URL) is
  sent; every device resolves its own audio. No stream URL is ever shared.
- **Rooms close when everyone leaves.** Nothing is stored on the server.

### 📝 Playlists

- **Playlists that actually create.** "New playlist" writes the playlist row
  before its first song, which is what the foreign key demands.
- **Songs stay.** Adding a track you've never played still works — the song row is
  written first.

### 🔍 Search

- **Search that keeps up with you.** Results are fetched while you type
  (debounced, last-write-wins). Only submitted queries are saved to "Recent".

### 📥 Offline Experience

- **Menu — offline.** A fourth tab listing everything playable with no network:
  songs kept in the player cache plus anything downloaded. Badges say which is
  which, and the header reports real bytes on disk.

### 🔄 OTA Updater

- **Seamless updates.** Point TRACE at a JSON release feed and it checks once per
  launch: a notification plus a changelog dialog, then one tap hands the download
  to Android's installer. Nothing is fetched when the feed URL is left blank. See
  [`docs/UPDATES.md`](docs/UPDATES.md).

### 🛡️ 100% Privacy

- **Zero data collection.** No trackers, no telemetry, no analytics.
- **Local security.** All libraries, preferences and cached tracks are stored
  locally in Room.

---

## 🚗 Android Auto Setup

If TRACE doesn't appear in Android Auto:

1. Open Android Auto on your phone
2. Tap the hamburger menu (three lines) and go to Settings
3. Scroll to the bottom and tap the version number multiple times to enable
   Developer Settings
4. Tap the three dots menu (⋮) at the top-right
5. Select Developer settings
6. Enable Unknown sources
7. Restart Android Auto and connect to your car

---

## 🤝 Contributing

Contributions are welcome! Whether it's bug reports, feature requests, or code
contributions:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 🛡️ Privacy & Data Collection

At TRACE, your privacy is our top priority. We believe that your music and data
belong exclusively to you.

- **Zero Data Collection:** We do not collect, store, or share any of your
  personal information, usage habits, or listening history.
- **100% Local:** All your settings, downloaded tracks and offline caches are
  stored securely on your device.
- **No Tracking:** There are no hidden trackers, analytics, or background services
  monitoring your activity.

Enjoy your music with complete peace of mind, knowing that your privacy is fully
protected.

---

## 📜 Disclaimer

This project and its contents are not affiliated with, funded, authorized,
endorsed by, or in any way associated with YouTube, Google LLC, or any of their
affiliates and subsidiaries.

Any trademark, service mark, trade name, or other intellectual property rights
used in this project are owned by their respective owners.

TRACE is an independent project created for educational and personal use purposes.

---

## 📄 License & Guidelines

This project is licensed under the terms specified in the
[LICENSE](LICENSE) file (GPL-3.0).

TRACE is a derivative of Vivi Music 6.0.8 and preserves all upstream notices.
See [`THIRD_PARTY_LICENSES.md`](THIRD_PARTY_LICENSES.md) for the complete list, or
open **Settings → Open-source licences** inside the app.

Proprietary upstream modules (Musixmatch, JioSaavn, Kizzy/Discord RPC) are **not**
included.

If you copy, adapt, or reuse any part of the source code, you must adhere to the
guidelines outlined in [`rules.md`](rules.md).

---

## 🌐 Community & Support

| Channel | About | Action |
|---|---|---|
| 🐛 Bug Reports | Found something broken? Open a GitHub issue | [Report Bug](https://github.com/CHANGE-ME/TRACE/issues) |
| 💡 Discussions | Share ideas, request features | [Discussions](https://github.com/CHANGE-ME/TRACE/discussions) |
| 📖 Docs | Listen Together, updates, architecture | [`docs/`](docs/) |

---

## 🙏 Special Thanks & Credits

TRACE is built upon the foundation of amazing open-source projects and developers:

- **Vivi Music** — the streaming and playback engine this project derives from.
- **Metrolist** — the project that inspired Vivi Music.
- **InnerTube / NewPipeExtractor** — discovery and stream resolution.
- **Media3 / ExoPlayer** — playback.
- **Jetpack Compose & Material 3** — the UI toolkit.

Thank you to all the amazing developers who made this project possible!

---

Made with ❤️ for music lovers everywhere

⭐ Star this repo if you enjoy TRACE!
