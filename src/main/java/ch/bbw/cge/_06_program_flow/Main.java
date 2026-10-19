package ch.bbw.cge._06_program_flow;

public class Main {

    public static void main(String[] args) {
        FlowExamples flowExamples = new FlowExamples();

        System.out.println(flowExamples.describeScore(72));
        System.out.println(flowExamples.describeLevel(2));
        flowExamples.printSelectedNumbers();
        flowExamples.printNames();
        flowExamples.countWithWhile();
        flowExamples.countWithDoWhile();

        LoginService loginService = new LoginService();
        boolean loginSuccessful = loginService.login("learner", "java320!");
        System.out.println("Login successful: " + loginSuccessful);
    }
}
