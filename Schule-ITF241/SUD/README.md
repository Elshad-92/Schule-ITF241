SUD (Software- und Systementwicklung)

In diesem Ordner findest du die Lessons LS01 bis LS30. Jede Lesson hat einen eigenen Ordner (LS01, LS02, ... LS30).

Empfehlung:
- Lege in jedem `LSxx`-Ordner eine passende Struktur für die Programmiersprache an, z.B. `src/`, `tests/` oder `main.py` / `Main.java`.
- Benutze aussagekräftige Dateinamen und kommentiere deinen Code.

Beispielstruktur pro Lesson:
LS01/
  - README.md (Aufgabenstellung)
  - src/ (Quellcode)
  - test/ (Tests)

Java 11 (Hinweis)
- Dieses Projekt ist für Java 11 ausgelegt. Jede Lesson (`LSxx`) enthält eine Java-Ordnerstruktur unter `src/main/java` mit dem Package-Namen `com.schule.sud.lsxx`.
- Beispiel: `SUD/LS01/src/main/java/com/schule/sud/ls01/Main.java` mit der Klasse `com.schule.sud.ls01.Main`.

Kompilieren und Ausführen (ohne Build-Tool, mit Java 11):
- Kompilieren (setzt voraus, dass `javac` im PATH ist):
  ```
  javac -d out SUD\\LS01\\src\\main\\java\\com\\schule\\sud\\ls01\\Main.java
  ```
- Ausführen:
  ```
  java -cp out com.schule.sud.ls01.Main
  ```

Alternativ: Nutze ein Build-Tool wie Maven oder Gradle (empfohlen für größere Projekte). Die Standard-Maven-Ordnerstruktur ist bereits durch `src/main/java` abgedeckt.

Konventionen:
- Package-Namen klein schreiben (z. B. `com.schule.sud.ls01`).
- Hauptklasse immer `Main` mit `public static void main(String[] args)` für einfache Aufgaben.
- Lege weitere Unterordner an, wenn du Tests, Ressourcen oder mehrere Programmiersprachen für eine Lesson benötigst.
