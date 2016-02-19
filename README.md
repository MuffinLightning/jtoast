# JToast
JavaFX Toast Notifications

![ex](img/ex2.PNG)

A Java class created with JavaFX used to create toast notifications on the user’s screen.

## Usage 

```java
// Create a new JToast

String title = "HEY YOU!";
        String message = "JToast is the coolest toast app ever!";
        Notification notification = Notifications.SUCCESS;

        JToast tray = new JToast();
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setNotification(notification);
        tray.showAndWait();

```

![ex](img/ex3.gif)



## ToDo
More documentation!
