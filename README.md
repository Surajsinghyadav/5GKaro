# 5GKaro 📱

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://android.com)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![API Level](https://img.shields.io/badge/API-31+-blue.svg)](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

A lightweight Android app designed to instantly access your phone's hidden Radio Info settings screen with a single tap. Say goodbye to manually dialing complex codes and hello to instant 5G network control.

## 📥 Download

<div align="center">

[![Download APK](https://img.shields.io/badge/Download-APK-brightgreen?style=for-the-badge)](https://github.com/Surajsinghyadav/5GKaro/raw/refs/heads/master/app/release/app-release.apk)

**[Direct Download Link](https://github.com/Surajsinghyadav/5GKaro/raw/refs/heads/master/app/release/app-release.apk)**

</div>

## 🚀 What is 5GKaro?

5GKaro provides instant access to your Android device's Radio Info settings screen, eliminating the need to manually dial `*#*#4636#*#*`. With just one tap, you can access detailed cellular network information and force your device to operate on **5G only (NR ONLY)** mode.

## 🎯 Why Choose 5GKaro?

Manually typing `*#*#4636#*#*` into the dialer is slow, error-prone, and cumbersome. 5GKaro revolutionizes this process by:

- **⚡ Instant Access** — Open radio info screen directly, no dialing required
- **🔧 Quick 5G Setup** — Force 5G only mode (NR ONLY) in seconds
- **⏱️ Time Saving** — Bypass manual steps and access advanced settings instantly
- **🎯 Developer Friendly** — Perfect for network testing and troubleshooting

## ✨ Features

- **One-Tap Launch** — Instant access to phone radio info settings using explicit intents
- **Robust Error Handling** — Graceful fallback if target activity is unavailable
- **Minimal Interface** — Clean, no-frills design optimized for speed
- **Zero Footprint** — Doesn't linger in recent apps or history
- **Lightweight** — Minimal resource usage and fast execution

## 🔧 How It Works

The app leverages Android's internal system components through explicit intents:

```kotlin
val intent = Intent(Intent.ACTION_MAIN).apply {
    setClassName("com.android.phone", "com.android.phone.settings.RadioInfo")
    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
}
startActivity(intent)
```

The app includes comprehensive error handling to prevent crashes and immediately finishes after launching the settings screen to maintain optimal performance.

## 🛠️ Technical Specifications

- **Language**: Kotlin
- **Framework**: Android Jetpack
- **Theme**: Translucent, no-title-bar for seamless UX
- **Configuration**: `noHistory` and `excludeFromRecents` for lightweight operation
- **Target API**: Level 31 (Android 12) with backward compatibility
- **Architecture**: Single-activity design with immediate finish

## 💡 Why I Built This

As a developer and power user, I found the manual dialer code approach frustrating and inefficient. 5GKaro was born from the need to:

- Eliminate friction in accessing critical network settings
- Reduce errors from manual code entry
- Improve workflow efficiency for developers and testers
- Provide instant 5G mode switching capabilities

This tool is especially valuable for network testers, Android developers, and tech enthusiasts who frequently need to access advanced cellular settings.

## 🎯 Target Audience

- **Network Engineers** — Quick access to radio information
- **Android Developers** — Testing network connectivity and behavior
- **Tech Enthusiasts** — Power users wanting advanced network control
- **QA Testers** — Efficient network testing workflows

## 📋 Requirements

- Android device with API level 21+ (Android 5.0+)
- Access to system radio info (available on most Android devices)

## 🤝 Contributing

We welcome contributions! Feel free to:

- Open issues for bugs or feature requests
- Submit pull requests for improvements
- Share feedback and suggestions

## 📄 License

This project is open-source and licensed under the **MIT License**. Feel free to use, modify, and distribute!

```
MIT License - see LICENSE file for details
```

## 🔗 Links

- **Repository**: [GitHub](https://github.com/Surajsinghyadav/5GKaro)
- **Issues**: [Report Issues](https://github.com/Surajsinghyadav/5GKaro/issues)
- **Releases**: [Download Releases](https://github.com/Surajsinghyadav/5GKaro/releases)

---

<div align="center">

**Made with ❤️ for the Android community**

⭐ Star this repo if 5GKaro helped you!

</div>
