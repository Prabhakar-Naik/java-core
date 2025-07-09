package com.springboot.designpatterns.behavioral.chainofresponsibility;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Handler 3
public class ManagementSupportHandler implements SupportHandler{

    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() >= 3) {
            System.out.println("Management Support handled request: " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled: " + request.getMessage());
        }
    }
}

// Usage
// public class ChainOfResponsibilityDemo {
//     public static void main(String[] args) {
//         L1SupportHandler l1 = new L1SupportHandler();
//         L2SupportHandler l2 = new L2SupportHandler();
//         ManagementSupportHandler management = new ManagementSupportHandler();
//
//         l1.setNextHandler(l2);
//         l2.setNextHandler(management);
//
//         l1.handleRequest(new Request(1, "Simple query about product features."));
//         l1.handleRequest(new Request(2, "Technical issue with software installation."));
//         l1.handleRequest(new Request(3, "Serious complaint about service."));
//         l1.handleRequest(new Request(4, "Urgent legal matter."));
//         l1.handleRequest(new Request(0, "Invalid request level."));
//     }
// }
