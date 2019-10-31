# Cucumber with Selenium WebDriver Template

A basic gradle project for automatic testing with cucumber and selenium webdriver.

## [Build](BUILD.md)

Read the build file for the pre-requisites.

## Usage

1. **Clone** this repository on your local.

2. Remove the **.git folder** from where you've cloned the repository.

3. Run the **cucumber test** using the following command:

   ```
   gradlew test
   ```

   > Expect to see some firefox browser activities. If it completes successfully your setup is good.
   

# Sample Feature File

The sample **cucumber feature file** is called **google_cheese.feature** and is located in the following directory:

```
<LOCAL_CLONED_REPO_DIR>\src\test\resources\gradle\cucumber
```

> The **LOCAL_CLONED_REPO_DIR** is where you've cloned this repository.

# Sample Cucumber Runner File

The sample **cucumber runner file** is called **CucumberRunner.java** and is located in the following directory:

```
<LOCAL_CLONED_REPO_DIR>\src\test\java\gradle\cucumber
```

> The **LOCAL_CLONED_REPO_DIR** is where you've cloned this repository.

# Sample Step Definition

The sample **step definition file** is called **GoogleCheese.java** and is located in the following directory:

```
<LOCAL_CLONED_REPO_DIR>\src\test\java\gradle\cucumber
```

> The **LOCAL_CLONED_REPO_DIR** is where you've cloned this repository.

## WebDriver

The only driver that is part of this template is **geckodriver.exe** for **firefox** and is located in the following directory:

```
<LOCAL_CLONED_REPO_DIR>\webdriver
```

> The **LOCAL_CLONED_REPO_DIR** is where you've cloned this repository.

## Author

* Ronaldo Webb
