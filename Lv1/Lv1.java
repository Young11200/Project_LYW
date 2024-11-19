package Lv1;

import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 처리하기 위한 Scanner 객체 생성.
        String choice; // 사용자의 반복 여부 선택 ("Exit" 또는 계속 입력)을 저장할 변수.

        do { // do-while 반복문: 최소 1회 실행 후 사용자의 선택에 따라 반복 여부를 결정.
            System.out.print("첫 번째 숫자를 입력하세요: "); // 첫 번째 숫자 입력 받기
            double num1 = scanner.nextDouble(); // 사용자로부터 첫 번째 숫자 입력.

            System.out.print("연산을 선택하세요 (+, -, *, /): "); // 연산자 입력 받기
            char operator = scanner.next().charAt(0); // 연산자를 문자로 입력 받음.

            System.out.print("두 번째 숫자를 입력하세요: "); // 두 번째 숫자 입력 받기
            double num2 = scanner.nextDouble(); // 사용자로부터 두 번째 숫자 입력.

            // 연산 수행 및 결과 출력
            double result; // 연산 결과를 저장할 변수 선언.
            switch (operator) { // 입력된 연산자에 따라 분기 처리.
                case '+': // '+' 연산인 경우
                    result = num1 + num2; // 두 숫자를 더함.
                    System.out.println("결과: " + result); // 결과 출력.
                    break;
                case '-': // '-' 연산인 경우
                    result = num1 - num2; // 두 숫자를 뺌.
                    System.out.println("결과: " + result); // 결과 출력.
                    break;
                case '*': // '*' 연산인 경우
                    result = num1 * num2; // 두 숫자를 곱함.
                    System.out.println("결과: " + result); // 결과 출력.
                    break;
                case '/': // '/' 연산인 경우
                    if (num2 != 0) { // 두 번째 숫자가 0이 아닌 경우에만 나눗셈 수행.
                        result = num1 / num2; // 첫 번째 숫자를 두 번째 숫자로 나눔.
                        System.out.println("결과: " + result); // 결과 출력.
                    } else {
                        System.out.println("오류: 0으로 나눌 수 없습니다!");
                        // 0으로 나누는 경우 오류 메시지 출력.
                    }
                    break;
                default: // 유효하지 않은 연산자를 입력한 경우
                    System.out.println("잘못된 연산자를 입력했습니다!"); // 오류 메시지 출력.
            }

            // 계산 반복 여부 묻기
            System.out.print("계속 계산하시겠습니까? (계속하려면 아무 키나 입력하고, 종료하려면 'Exit'를 입력하세요): ");
            choice = scanner.next(); // 사용자 입력 받기

        } while (!choice.equals("Exit")); // 사용자가 'Exit'를 입력하지 않은 경우 반복. -> 앞에 대문자만 가능....

        // 프로그램 종료 메시지
        System.out.println("계산기를 종료합니다.");
    }
}
