# Schule-ITF241

Projektstruktur für die Schule.

Enthält Ordner für jedes Fach:
- Deutsch
- Englisch
- Politik
- WUB
- EVP
- SUD (mit LS01–LS30 für Programmieraufgaben)

Git & GitHub (Git Bash)
- Erstellt ein lokales Git-Repository und pusht es zu GitHub:
  1. git init
  2. git checkout -b main
  3. git add .
  4. git commit -m "Initial commit: project structure and Java 11 setup"
  5. Erstelle ein neues Repo auf GitHub und kopiere die Remote-URL (z. B. git@github.com:USERNAME/schule-itf241.git)
  6. git remote add origin <REMOTE_URL>
  7. git push -u origin main

Java 11 (ohne Build-Tool)
- Dieses Projekt ist für Java 11 ausgelegt. In jedem `SUD/LSxx` ist deine Java-Übung unter `src/main/java/com/schule/sud/lsxx` gespeichert.
- Kompilieren (Beispiel für LS01):
  ```
  javac -d out SUD\\LS01\\src\\main\\java\\com\\schule\\sud\\ls01\\Main.java
  ```
- Ausführen:
  ```
  java -cp out com.schule.sud.ls01.Main
  ```

Hinweis:
- Du brauchst kein Maven oder Gradle. Nutze einfach `javac` und `java` oder ein IDE wie IntelliJ IDEA, das Java 11 unterstützt.
