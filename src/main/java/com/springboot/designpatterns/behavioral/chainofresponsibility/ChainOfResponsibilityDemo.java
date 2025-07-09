package com.springboot.designpatterns.behavioral.chainofresponsibility;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Passes a request along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler.
                Example: Handling customer support requests (e.g., L1 support, L2 support, Management).
                """);
        L1SupportHandler l1 = new L1SupportHandler();
        L2SupportHandler l2 = new L2SupportHandler();
        ManagementSupportHandler management = new ManagementSupportHandler();

        l1.setNextHandler(l2);
        l2.setNextHandler(management);

        l1.handleRequest(new Request(1, "Simple query about product features."));
        l1.handleRequest(new Request(2, "Technical issue with software installation."));
        l1.handleRequest(new Request(3, "Serious complaint about service."));
        l1.handleRequest(new Request(4, "Urgent legal matter."));
        l1.handleRequest(new Request(0, "Invalid request level."));
    }
}
