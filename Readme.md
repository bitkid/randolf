# Randolf the reindeer
Autogenerated data for your tests.

[![Download](https://api.bintray.com/packages/christophsturm/maven/randolf/images/download.svg)](https://bintray.com/christophsturm/maven/randolf/_latestVersion)
[![CircleCI](https://circleci.com/gh/christophsturm/randolf/tree/master.svg?style=svg)](https://circleci.com/gh/christophsturm/randolf/tree/master)

This is how it looks in action:
```
enum class BeanType { ROBUSTA, ARABICA }
data class Group(val name: String)
data class User(
    val firstName: String,
    val name: String,
    val age: Int,
    val lat: Double,
    val lon: Double,
    val isBoss: Boolean,
    val teamSize: Short,
    val flags: Byte,
    val shortName: Char,
    val efficiency: Float,
    val favoriteCoffee: BeanType,
    val groups: List<Group>
)
print(Randolf().create<User>())
        
//=> User(firstName=QV muCLbUVfVheboeSuN, name=MSdOzpRCFIykprACOHjv, age=2116525025, lat=0.9518687079417872, lon=0.8331958938906572, isBoss=false, teamSize=4310, flags=83, shortName=Z, efficiency=0.76879007, favoriteCoffee=ARABICA, groups=[Group(name=TpiFXUrucFA cMARKLiR), Group(name=floFeNep XBEZUfXwQgL)])
```

# Usage:
Add this to your gradle file's dependency block:

```
    testCompile("com.christophsturm:randolf:0.1.0")
```

Add jcenter if you haven't already:

```
repositories {
    jcenter()
}
```

You can create any kotlin data class like in the example above. All fields will be set, even nullable fields.
You can select to set only fields that are absolutely necessary by calling `Randolf.create(minimal=true)` instead.
Minimal mode will set all nullable fields to null, numbers to 0 and make strings, lists and maps empty.
For more usage examples just take a look at the [unit tests](src/test/kotlin/randolf/RandolfTest.kt).


Currently supported types:
* String
* Int
* Long
* Double
* Enums
* List
* Set
* Collection
* Map

Next steps:
* configuration (while still making sure that it works great without any config)
* use a configurable random seed to reproduce test failures 
* add an optional non random mode inspired by [fakir](https://github.com/dmcg/fakir)
* build for kotlin/js and kotlin/native. 

[![Download](https://api.bintray.com/packages/christophsturm/maven/randolf/images/download.svg)](https://bintray.com/christophsturm/maven/randolf/_latestVersion)
[![CircleCI](https://circleci.com/gh/christophsturm/randolf/tree/master.svg?style=svg)](https://circleci.com/gh/christophsturm/randolf/tree/master)