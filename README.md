# sdkfx

Demo application that provides a Material Design inspired look for JavaFX

## Building and Relase

```
mvn -P release clean install
mvn release:prepare
mvn release:perform

# This doesn't always fully work and deploy to bintray. On failure run
mvn deploy
```


