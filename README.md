### RandomUtils

![GitHub Actions](https://github.com/powercasgamer/RandomUtils/actions/workflows/gradle.yml/badge.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=powercasgamer_RandomUtils&metric=alert_status)](https://sonarcloud.io/dashboard?id=powercasgamer_RandomUtils)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=powercasgamer_RandomUtils&metric=ncloc)](https://sonarcloud.io/dashboard?id=powercasgamer_RandomUtils)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=powercasgamer_RandomUtils&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=powercasgamer_RandomUtils)
Version: 1.0-SNAPSHOT
---
## How to use

First you'll want to add RandomUtils as a dependency
Replace `<version>` with the version tag

Gradle Example:
```groovy
repositories {
    maven {
        name = "DeltaPvP Repositories"
        url = "https://repo.deltapvp.net/"
    }
}

dependencies {
    implementation 'net.deltapvp:RandomUtils:<version>'
}
```

Maven Example:
```xml
<!-- TODO -->
```

```java
package com.example.testplugin;

import net.deltapvp.randomutils.RandomUtils;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {
    private RandomUtils randomUtils = new RandomUtils();

    @Override
    public void onLoad() {
        randomUtils.onLoad();
    }
    
    @Override
    public void onEnable() {
        randomUtils.onDisable();
    }

    @Override
    public void onDisable() {
        randomUtils.onDisable();
    }

    public RandomUtils getRandomUtils() {
        return this.randomUtils;
    }
}
```

---
## License

RandomUtils is licensed under MIT

- [License](https://github.com/powercasgamer/RandomUtils/blob/master/LICENSE)