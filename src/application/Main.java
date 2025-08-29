package application;

import entities.Account;
import exception.BussinessException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("informe os dados da conta: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, 0.0, withdrawLimit);

        System.out.print("informe um valor para deposito inicial: ");
        double balance = sc.nextDouble();
        acc.deposit(balance);

        System.out.println("Conta criada com sucesso!");
        System.out.println();


        System.out.print("Informe uma quantidade para saque: ");
        double amount = sc.nextDouble();

        try {acc.withdraw(amount);
        System.out.println("Novo saldo: " + acc.getBalance());

        } catch (BussinessException e) {
            System.out.println(e.getMessage());

        }
    }

}