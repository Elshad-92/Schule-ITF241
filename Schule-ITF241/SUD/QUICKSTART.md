# 🚀 QUICK START - SUD Lernsituationen

## Aufgabe ausführen - 3 Schritte

1. **Datei öffnen:**
   ```
   SUD → LS0X → src → Main.java
   ```

2. **Ausführen:**
   ```
   Shift + F10  (oder Play-Button klicken)
   ```

3. **Output sehen:**
   ```
   Konsole unten → Ergebnis anschauen
   ```

---

## Das Problem mit mehreren `main` Methoden

**Warum das passiert:**
- Du hast 30 separate Projekte (LS01-LS30)
- Jedes hat eine `Main.java` mit einer `main`-Methode
- Java kann nicht automatisch wissen, welche man ausführen soll

**Beste Lösung:**
- ✅ **Jede LS einzeln ausführen** (wie oben beschrieben)
- ✅ **Separate Projekte = beste Praxis!**
- ❌ **Nicht alles in ein Projekt mischen**

---

## IntelliJ Tipps

### Run Configuration erstellen (Optional)
1. **Run → Edit Configurations**
2. **+ → Add New Configuration**
3. **Main class:** Wähle `SUD/LSxx/src/Main.java`
4. **Name:** `LS01`, `LS02`, etc.
5. Jetzt kannst du schnell zwischen Aufgaben wechseln! 🎯

### Keyboard Shortcuts
```
Shift+F10    → Aktuelle Datei ausführen
Shift+Ctrl+F10 → Letzte Ausführung wiederholen
```

---

## Struktur Übersicht

```
✅ Die RICHTIGE Struktur (what you have)
├── LS01/ (unabhängiges Projekt)
│   └── Main.java
├── LS02/ (unabhängiges Projekt)
│   └── Main.java
└── LS03/ (unabhängiges Projekt)
    └── Main.java

❌ Das wäre FALSCH
└── Main.java (nur eine!)
    ├── LS01-Code
    ├── LS02-Code
    └── LS03-Code
```

---

## Häufige Fehler

| Fehler | Lösung |
|--------|--------|
| "Main.java not found" | Check: `SUD/LSxx/src/` Pfad |
| Mehrere Main-Klassen | Das ist normal! Führe LSxx einzeln aus |
| "Cannot find symbol" | Stelle sicher deine Imports sind richtig |

---

## Jede LS ausführen

| Unit | Pfad | Ausführen |
|------|------|-----------|
| LS01 | `SUD/LS01/src/Main.java` | Shift+F10 |
| LS02 | `SUD/LS02/src/Main.java` | Shift+F10 |
| LS03 | `SUD/LS03/src/Main.java` | Shift+F10 |
| ... | ... | ... |
| LS30 | `SUD/LS30/src/Main.java` | Shift+F10 |

---

**Das war's! 🎉 Einfach die gewünschte Main.java öffnen und mit Shift+F10 ausführen.**

