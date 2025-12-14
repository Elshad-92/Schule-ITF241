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

Java/Maven
- Root ist ein Maven Aggregator-POM; jedes `SUD/LSxx` ist ein Modul.
- Maven-Build (im Projekt-Root):
  mvn -v
  mvn -T 1C -pl SUD/LS01 -am package
