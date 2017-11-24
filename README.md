# Spring boot application as maven multi-module architecture - empty skeleton

### This Spring boot application is a multi Maven module web application. According to my experience as a young developer, the biggest problems occur on setting up the environment. So I created a skeleton app which can have multiple maven modules. The application's configuration is annotation based. Spring components are scanned and wired.

Dependencies that are set up should not be changed. For now, dependencies in the application are:
* web -> service-api => web module can access only the api abstraction, it should not be aware of the api implementation or other modules that are not important for this module's functionality
* service-impl -> service-api => due to the parent interfaces which should be implemented in this module
* app -> web/service-impl => due the Spring's component-scan and configuration. This module contains the main entry point of this Spring boot application.

This app skeleton is open for changes by other developers (contributors) and can be used by other developers for faster and easier environment setup. The initial state of this project is on this date (24.11.2017), so there are coming up more changes and updates in the future.

To contributors: If you have some ideas for a specific environment setup, please fork this project on a new branch, so we can keep specific setups on different branches.

Hope this will be of help for many developers.
