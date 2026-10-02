# 📁 Java File Organizer

A Java-based file management application that automatically organizes files into categorized folders based on their file extensions.

This project was built to practice Java File I/O, Java NIO, Object-Oriented Programming, exception handling, and working with the local file system.

---

## 🚀 Features

- 📂 Scans files from a selected folder
- 🔍 Detects file extensions automatically
- 🗂️ Categorizes files into different folders
- 📦 Automatically creates category folders
- 🚚 Moves files into their appropriate categories
- 🔄 Handles duplicate filenames safely
- ⚠️ Handles files without extensions
- 🛡️ Uses exception handling for file operation errors
- 🌐 Supports filenames containing different languages and special characters

---

## 📋 File Categories

| Category | Extensions |
|----------|------------|
| 🖼️ Images | `.jpg`, `.jpeg`, `.png`, `.gif` |
| 📄 Documents | `.pdf`, `.docx`, `.txt` |
| 🎵 Music | `.mp3`, `.wav`, `.flac` |
| 🎬 Videos | `.mp4`, `.mkv`, `.avi` |
| 💻 Code | `.java`, `.py`, `.cpp`, `.js` |
| 📊 Data | `.csv`, `.xlsx`, `.json` |
| 📦 Others | Unknown extensions and files without extensions |

---

## 🛠️ Technologies Used

- **Java**
- **Java File I/O**
- **Java NIO**
- **Object-Oriented Programming**
- **Exception Handling**
- **Eclipse IDE**

---

## 📂 Project Structure

```text
java_file_organizer
│
├── src
│   ├── FileOrganizer.java
│   ├── FileClassifier.java
│   └── FileMover.java
│
└── TestFiles
