The abstract factory interface declares a set of methods that return different abstract products. These products are called a family and are related by a high-level theme or concept. Products of one family are usually able to collaborate among themselves. A family of products may have several variants, but the products of one variant are incompatible with the products of another variant.

```pseudo
interface GUIFactory is
    method createButton(): Button
    method createScrollBar(): ScrollBar
    method createMenu(): Menu
```

Concrete factories produce a family of products that belong to a single variant. The factory guarantees that the resulting products are compatible. Signatures of the concrete factory's methods return an abstract product, while inside the method a concrete product is instantiated.

```pseudo
class WinFactory implements GUIFactory is
    method createButton(): Button is
        return new WinButton()
    method createScrollBar(): ScrollBar is
        return new WinScrollBar()
    method createMenu(): Menu is
        return new WinMenu()
```

Each concrete factory has a corresponding product variant.

```pseudo
class MacFactory implements GUIFactory is
    method createButton(): Button is
        return new MacButton()
    method createScrollBar(): ScrollBar is
        return new MacScrollBar()
    method createMenu(): Menu is
        return new MacMenu()

class LinuxFactory implements GUIFactory is
    method createButton(): Button is
        return new LinuxButton()
    method createScrollBar(): ScrollBar is
        return new LinuxScrollBar()
    method createMenu(): Menu is
        return new LinuxMenu()
```

Each distinct product of a product family should have a base interface. All variants of the product must implement this interface.

```pseudo
interface Button is
    method render()
```

Concrete products are created by corresponding concrete factories.

```pseudo
class WinButton implements Button is
    method render() is
        // Render a button in Windows style.

class MacButton implements Button is
    method render() is
        // Render a button in macOS style.

class LinuxButton implements Button is
    method render() is
        // Render a button in Linux style.
```

Here's the base interface of another product. All products can interact with each other, but proper interaction is possible only between products of the same concrete variant.

```pseudo
interface ScrollBar is
    method scroll()

class WinScrollBar implements ScrollBar is
    method scroll() is
        // Render a scrollbar in Windows style.

class MacScrollBar implements ScrollBar is
    method scroll() is
        // Render a scrollbar in macOS style.

class LinuxScrollBar implements ScrollBar is
    method scroll() is
        // Render a scrollbar in Linux style.
```

Another product interface for menus.

```pseudo
interface Menu is
    method display()

class WinMenu implements Menu is
    method display() is
        // Render a menu in Windows style.

class MacMenu implements Menu is
    method display() is
        // Render a menu in macOS style.

class LinuxMenu implements Menu is
    method display() is
        // Render a menu in Linux style.
```

The client code works with factories and products only through abstract types: GUIFactory, Button, ScrollBar, and Menu. This lets you pass any factory or product subclass to the client code without breaking it.
The client picks the factory type depending on the current configuration or environment settings and creates it at runtime (usually at the initialization stage).

```pseudo
class Client is
    private field button: Button
    private field scrollBar: ScrollBar
    private field menu: Menu

    constructor Client(factory: GUIFactory) is
        button = factory.createButton()
        scrollBar = factory.createScrollBar()
        menu = factory.createMenu()

    method render() is
        button.render()
        scrollBar.scroll()
        menu.display()

    method main() is
        // Example: Using the Windows Factory
        windowsFactory = new WindowsFactory()
        windowsClient = new Client(windowsFactory)
        windowsClient.render()

        // Example: Using the Mac Factory
        macFactory = new MacFactory()
        macClient = new Client(macFactory)
        macClient.render()

        // Example: Using the Linux Factory
        linuxFactory = new LinuxFactory()
        linuxClient = new Client(linuxFactory)
        linuxClient.render()
```



