# Wolkenlos-Template
Hier wird euch gezeigt wie ihr das Template benutzt um neue Plugins zu erstellen.
**Wichtig!** Das ist ein Template für Kotlin Plugins daher empfehle ich es nicht für Java-Projekte zu nutzen.

## Schritt 1: Wie bekommt ihr das Template auf euren PC
Zuerst sollte es bei dem Repository die Option geben, das Template zu benutzen. Anschließend geht ihr in [Github Desktop](https://desktop.github.com) 
auf `File` und dann auf `Clone Repository...`. Dort wählt ihr dann das neu erstellte Repository aus und klickt auf `Clone`.
## Schritt 2: Umbennenung 
Damit ihr am Ende nicht ein Plugin entwickelt mit dem Namen `template` folgt folgenden Unterschritten:

1. Nennt den Path von [`src/main/kotlin/eu/wolkenlosmc/template`](https://github.com/WolkenlosMC/Wolkenlos-Template/tree/main/src/main) zu [`src/main/kotlin/eu/wolkenlosmc/PluginName`](https://github.com/WolkenlosMC/Wolkenlos-Template/tree/main/src/main) um.
2. Nennt die [`Template.kt`](https://github.com/WolkenlosMC/Wolkenlos-Template/tree/main/src/main/kotlin/eu/wolkenlosmc/template) zu [`PluginName.kt`](https://github.com/WolkenlosMC/Wolkenlos-Template/tree/main/src/main/kotlin/eu/wolkenlosmc/template) um.
3. Ändert den Path zu eurer Main-Class, den Plugin Namen und den Author in der [`plugin.yml`](https://github.com/WolkenlosMC/Wolkenlos-Template/blob/main/src/main/resources/plugin.yml).
4. Ändert den `rootProject.name` in der [`settings.gralde`](https://github.com/WolkenlosMC/Wolkenlos-Template/blob/main/settings.gradle) zu dem Namen eures Plugins/Projektes.

> [!IMPORTANT]
> Wenn nur einer der Schritte nicht ausgeführt wurde, wird das Plugin nicht funktionieren.

> [!NOTE]
> Sollten trotz des Tutorials Fragen auftauchen, meldet euch bitte bei TheSkyScout. :)
