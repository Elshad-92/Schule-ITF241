# SUD - Lernsituationen (LS01-LS30)

Dieses Verzeichnis enthält 30 Lernsituationen für die Schulung in Programmierung.

## 📁 Projektstruktur

```
SUD/
├── LS01/
│   ├── src/
│   │   └── Main.java
│   └── LS01.iml
├── LS02/
│   └── ...
├── ...
├── LS30/
│   └── src/
│       └── Main.java
├── Launcher.java        ← Zentrale Orientierungshilfe
└── README.md           ← Diese Datei
```

## 🎯 Warum sind die Lernsituationen separate Projekte?

Dies ist **beste Praxis** für Schulprojekte:

✅ **Vorteile:**
- Jede Aufgabe ist unabhängig und in sich geschlossen
- Keine Konflikte zwischen verschiedenen `main`-Methoden
- Klare Trennung von Aufgaben
- Leicht zu navigieren und zu verstehen
- Einfach zu versionskontrollieren (Git)

❌ **Nachteil:**
- Kann nicht alle auf einmal von einer zentralen `main` ausführen

## 🚀 Wie man die Aufgaben ausführt

### Option 1: Direkt in IntelliJ (Empfohlen)
1. Öffne den `SUD` Ordner als Projekt
2. Navigiere zur gewünschten Lernsituation, z.B. `LS01/src/Main.java`
3. Drücke **Shift+F10** oder klicke auf den grünen Play-Button neben der `main`-Methode
4. Die Ausgabe erscheint in der Konsole

### Option 2: Mit dem Launcher (Optional)
```bash
javac Launcher.java
java Launcher
```
Der Launcher zeigt dir eine Übersicht aller Lernsituationen und leitet dich zur korrekten Datei weiter.

## 📝 Beispiel: LS01 ausführen

**Schritt 1:** Öffne `SUD/LS01/src/Main.java`

**Schritt 2:** Drücke Shift+F10 oder nutze das Run-Menü

**Schritt 3:** Die Ausgabe erscheint in der Konsole

## 🔧 Wenn du mehrere Aufgaben zusammenfassen möchtest

Falls du später ein großes Projekt mit allen Aufgaben brauchst, kannst du:

1. **Alle `Main`-Klassen umbenennen** (z.B. `LS01.java`, `LS02.java`)
2. **Ein neues `Main.java`** als Einstiegspunkt erstellen
3. **Andere Klassen importieren und aufrufen**

Beispiel:
```java
// Neues Main.java
public class Main {
    public static void main(String[] args) {
        LS01.main(args);  // Ruft die erste Aufgabe auf
    }
}
```

## 📚 Aufgabenübersicht

| LS | Thema | Status |
|----|-------|--------|
| LS01 | Grundlagen | ✅ |
| LS02 | BMI & Zahlenumwandlung | ✅ |
| LS03 | Schleifen | ✅ |
| LS04 | Zahlenausgabe | ✅ |
| LS05 | Scanner & Input | ✅ |
| LS06-LS30 | Weitere Aufgaben | 🚀 |

## 💡 Best Practice Tipps

1. **Nutze das rechts oben angezeigte Run-Menü** um schnell zwischen Aufgaben zu wechseln
2. **Erstelle Run Configurations** in IntelliJ für jede LS (Optional)
3. **Halte `Main.java` einfach** - konzentriere dich auf die Logik in anderen Klassen
4. **Kommentiere deine Aufgaben** - das hilft später beim Verstehen

## ❓ Häufig gestellte Fragen

**F: Kann ich alle Aufgaben von einer `main` ausführen?**
A: Ja, sieh dir die "Wenn du mehrere Aufgaben zusammenfassen möchtest" Section an.

**F: Warum bekomme ich "Main.java not found"?**
A: Stelle sicher, dass du dich im richtigen Ordner befindest: `SUD/LS0X/src/Main.java`

**F: Kann ich zwei Aufgaben gleichzeitig ausführen?**
A: Ja, öffne zwei IntelliJ-Fenster mit verschiedenen Run-Konfigurationen.

---

**Viel Spaß beim Programmieren! 🎉**

