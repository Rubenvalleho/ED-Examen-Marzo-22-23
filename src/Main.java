import com.rubenvj.bank.features.bankAccount.data.BankAccountDataRepository;
import com.rubenvj.bank.features.bankAccount.domain.BankAccount;
import com.rubenvj.bank.features.bankAccount.domain.CreateBankAccountUseCase;
import com.rubenvj.bank.features.bankAccount.presentation.MainBankAccount;
import com.rubenvj.bank.features.bankProducts.data.BankProductsDataRepository;
import com.rubenvj.bank.features.bankProducts.domain.Mortgage;
import com.rubenvj.bank.features.bankProducts.presentation.MainBankProducts;
import com.rubenvj.bank.features.customer.data.CustomerDataRepository;
import com.rubenvj.bank.features.customer.domain.Customer;
import com.rubenvj.bank.features.customer.domain.GetCustomerUseCase;
import com.rubenvj.bank.features.customer.presentation.MainCustomer;
import com.rubenvj.bank.features.transaction.data.TransactionDataRepository;
import com.rubenvj.bank.features.transaction.domain.Transaction;
import com.rubenvj.bank.features.transaction.presentation.MainTransaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void archivoIniciar() {
        try {
            File archivo = new File("archivo.txt");
            if (archivo.createNewFile()) {
                System.out.println("PRIMERA VEZ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        MainTransaction.createTransaction(new Transaction("001", "Retirada de dinero", "-200€"));
        MainTransaction.createTransaction(new Transaction("002", "Ingreso de dinero", "300€"));

        MainCustomer.createCustomer(new Customer("70823234h", "Rubén", "Vallejo", "Casa", "Ávila", "05001"));
        MainCustomer.printCustomer("70823234h");

        MainBankProducts.createProducts(new Mortgage("001", "Hipoteca 1", "Hipoteca", "01/01/2024", "5%", "01/01/2040", "200.000€"));

        MainBankAccount.createAccount("70823234h");



        archivoIniciar();
    }
}