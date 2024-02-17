package filesAndDirectorories;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransactionMain {
    public static void main(String[] args) {
        List<Transaction> transactionList = new ArrayList<>();
        String location = "C:\\Users\\Dell\\IdeaProjects\\Dietel\\src\\filesAndDirectorories\\transaction.txt";
        transactionList.add(new Transaction("Isreal", "Delighted", BigDecimal.valueOf(20000).toString()));
        transactionList.add(new Transaction("Ope", "Delighted", BigDecimal.valueOf(20000).toString()));
        transactionList.add(new Transaction("Tobi", "Ope", BigDecimal.valueOf(5000).toString()));
        writeTransactionsTo(transactionList,location);
    }

    private static void writeTransactionsTo(List<Transaction> transactions, String fileLocation) {
        try (FileOutputStream outputStream = new FileOutputStream(fileLocation,true)) {
            String trans ="\n"+ transactions.toString();
            outputStream.write(trans.getBytes());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
