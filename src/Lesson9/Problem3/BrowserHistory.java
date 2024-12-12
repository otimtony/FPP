package Lesson9.Problem3;

import java.util.Stack;

public class BrowserHistory {
    private String currentURL;
    Stack<String> backStack = new Stack<>();
    Stack<String> forwardStack = new Stack<>();

    BrowserHistory(String url) {
        if (url == null) throw new RuntimeException("Initial URL cannot be Null");
        this.currentURL = url;
    }

    void visit(String url) {
        if (url == null) throw new RuntimeException("URL cannot be Null");

        backStack.push(this.currentURL);

        // Clearing forward stack on visiting new URL.
        this.forwardStack.clear();
        this.currentURL = url;
        System.out.println("Visited: " + this.getCurrentURL());
    }

    String getCurrentURL() {
        return currentURL;
    }

    void back() {
        if (backStack.isEmpty()) {
            System.out.println("Back history is empty");
            return;
        }
        forwardStack.push(currentURL);
        currentURL = backStack.pop();

        System.out.println("Back to: " + this.getCurrentURL());

    }

    void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Forward history is empty");
            return;
        }
        backStack.push(currentURL);
        currentURL = forwardStack.pop();

        System.out.println("Forward to: " + this.getCurrentURL());

    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.html");
        browser.visit("page1.html"); // Visited: Page1.html
        browser.visit("page2.html"); // Visited: Page2.html
        browser.back(); // Back to: page1.html
        browser.back(); // Back to: home.html
        browser.back(); // Back history is empty
        browser.forward(); // Forward to: page1.html
        browser.forward(); // Forward to: page2.html
        browser.forward();//forward history is Empty
        browser.visit("page3.html"); // Current URL page
    }
}
