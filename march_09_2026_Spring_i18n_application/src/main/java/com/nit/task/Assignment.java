/*Locale-Specific Date Formatting — Comprehensive Task
✅ Objective:
Enhance your Spring Core i18n application by adding locale-aware date formatting.

📁 File & Class Structure

/src
  └── /com/example/i18n
        ├── App.java
        ├── AppConfig.java (if using Java-based config)
        ├── AppConfig.xml (if using XML-based config)
        ├── DateFormatterUtil.java
        └── LocaleSelector.java

/resources/i18n
        ├── messages.properties (default) 
        ├── messages_en.properties
        ├── messages_fr.properties
        ├── messages_hi.properties
        └── messages_te.properties

📄 File Descriptions
✅ App.java

The main class with:
public static void main(String[] args)

Loads the ApplicationContext

Prompts user for locale input (e.g., en, fr)

Calls methods to retrieve the formatted date and display the message.

✅ AppConfig.java (if using Java-based config)

Annotated with @Configuration

Defines @Bean for ResourceBundleMessageSource

OR

✅ AppConfig.xml (if using XML-based config)

Defines <bean> for ResourceBundleMessageSource

✅ DateFormatterUtil.java

Contains static utility methods:

public static String formatDateForLocale(Locale locale, LocalDate date)

Uses DateTimeFormatter or SimpleDateFormat to apply the correct pattern.

✅ LocaleSelector.java

Utility to:

Read user input (language code)

Return a Locale object.

✅ /resources/i18n/messages_*.properties

Contains messages like:
date.message = Today's date is: {0}
Example:
messages_en.properties → date.message = Today's date is: {0}
messages_fr.properties → date.message = La date d'aujourd'hui est: {0}
messages_hi.properties → date.message = आज की तारीख है: {0}
messages_te.properties → date.message = ఈరోజు తేదీ: {0}

📋 Expected Flow
1️.App.java runs →
2️.Prompts: Enter locale (en, fr, hi, te): →
3️.Passes locale to DateFormatterUtil →
4️.Formats today’s date based on locale →
5️.Uses MessageSource to retrieve date.message →
6️.Displays:

Today's date is: 05-28-2025 (English)
La date d'aujourd'hui est: 28/05/2025 (French)
*/
