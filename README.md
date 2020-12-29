# RedundantVisibilityModifierRule with explicit API mode

Sample project to reproduce https://github.com/detekt/detekt/issues/3125

### Expected result:

```
BUILD SUCCESSFUL
```

### Actual result:

```
> Task :detekt FAILED
style - 5min debt
        RedundantVisibilityModifierRule - [someApiFunction] at ~/detekt-explicit-api-mode-test/src/main/kotlin/MyApi.kt:5:16

Overall debt: 5min


FAILURE: Build failed with an exception.
```