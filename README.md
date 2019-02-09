# KlaxonIssue243
Example project for issue #243 at Klaxon

Output when running `main`:
```
Exception in thread "main" com.beust.klaxon.KlaxonException: Unable to instantiate Test with parameters []
	at com.beust.klaxon.JsonObjectConverter.initIntoUserClass(JsonObjectConverter.kt:94)
	at com.beust.klaxon.JsonObjectConverter.fromJson(JsonObjectConverter.kt:32)
	at com.beust.klaxon.DefaultConverter.fromJsonObject(DefaultConverter.kt:204)
	at com.beust.klaxon.DefaultConverter.fromJson(DefaultConverter.kt:29)
	at com.beust.klaxon.Klaxon.fromJsonObject(Klaxon.kt:294)
	at KlaxonTestKt.main(KlaxonTest.kt:33)
	at KlaxonTestKt.main(KlaxonTest.kt)
```
