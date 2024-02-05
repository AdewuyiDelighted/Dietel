package PersonalAssessement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BudgetServices {
//    @Service
//    public class BudgetServiceImpl implements BudgetService {
//        @Autowired
//        private BudgetRepository budgetRepository;
//        @Autowired
//        private ExpensesTrackerAppRepository expensesTrackerAppRepository;
//        @Autowired
//        ExpenseService expenseService;
//        private double totalExpense;
//
//        private final ArrayList<Budget> listOfUserBudget = new ArrayList<>();
//
//        @Override
//        public Budget setBudget(SetBudgetRequest setBudgetRequest) {
//            Optional<ExpensesTrackerApp> expensesTrackerApp = expensesTrackerAppRepository.findByEmail(setBudgetRequest.getEmail());
//            if (expensesTrackerApp.isPresent()) {
//                validateBudgetDetails(setBudgetRequest, expensesTrackerApp);
//                Budget budget = map(setBudgetRequest, expensesTrackerApp.get().getId());
//                budgetRepository.save(budget);
//                listOfUserBudget.add(budget);
//                return budget;
//            }
//            throw new InvalidDetailsException("Invalid detail");
//        }
//
//        @Override
//
//        public double getBudgetBalance(String email) {
//            Budget budget = findBudget(email);
//            for (Expense expense : expenseService.getAllExpenseBelongingTo(budget.getExpenseAppTrackerId())) {
//                if (expense.getDateAdded().isAfter(budget.getStartDate().atStartOfDay().toLocalDate()) || expense.getDateAdded().isEqual(budget.getStartDate().atStartOfDay().toLocalDate())) {
//                    totalExpense += expense.getAmount();
//                }
//            }
//            budget.setBudgetBalance(budget.getBudgetBalance() - totalExpense);
//            return budget.getBudgetBalance();
//        }
//
//        @Override
//        public Budget findBudget(String email) {
//            Optional<ExpensesTrackerApp> expensesTrackerApp = expensesTrackerAppRepository.findByEmail(email);
//            if (expensesTrackerApp.isPresent()) {
//                return listOfUserBudget.getLast();
//            }
//            throw new InvalidDetailsException("Invalid Detail");
//        }
//
//        @Override
//        public Budget endBudget(String email) {
//            Optional<ExpensesTrackerApp> expensesTrackerApp = expensesTrackerAppRepository.findByEmail(email);
//            if (expensesTrackerApp.isPresent()) {
//                listOfUserBudget.getLast().setActive(false);
//            }
//            return listOfUserBudget.getLast();
//        }
//
//        @Override
//        public Budget resetBudget(ResetBudgetRequest resetBudgetRequest) {
//            Budget budget = findBudget(resetBudgetRequest.getEmail());
//            budget = map(resetBudgetRequest,budget);
//            budget.setBudgetBalance(budget.getBudgetBalance() + resetBudgetRequest.getNewAmount());
//            System.out.println(budget.getBudgetBalance());
//            return budget;
//        }
//
//
//        @Override
//        public List<Budget> findAllBudget(String email) {
//            Optional<ExpensesTrackerApp> expensesTrackerApp = expensesTrackerAppRepository.findByEmail(email);
//            if (expensesTrackerApp.isPresent()) {
//                return listOfUserBudget;
//            }
//            throw new InvalidDetailsException("Detail Invalid");
//        }
//
//        private void validateBudgetDetails(SetBudgetRequest setBudgetRequest, Optional<ExpensesTrackerApp> expensesTrackerApp) {
//            if (!listOfUserBudget.isEmpty()) {
//                validateActiveStatus(listOfUserBudget);
////            StartDate formattedEndDate = setBudgetRequest.getStartDate();
////            if (LocalDate.parse(formattedEndDate, dateTimeFormatter).isBefore(listOfUserBudget.getLast().getEndDate()) || listOfUserBudget.getLast().isActive())
////                throw new BudgetCanNotBeEnableException("Budget can't be enable due to existing budget (Check for reset of existing budget)");
////                validateActiveStatus(listOfUserBudget);
//            } else{
//                if (setBudgetRequest.getAmount() > expensesTrackerApp.get().getBalance())
//                    throw new InvalidBudgetAmountException("Balance too low for budget amount");
//            }
//        }
//    }
//

// public static Budget map(ResetBudgetRequest resetBudgetRequest,Budget budget) {
//        EndDate endDate = resetBudgetRequest.getNewEndDate();
//        String formattedResetDate = endDate.getYear() + "/" + endDate.getMonth() + "/" + endDate.getDate();
//        resetDateFormatter = formattedResetDate;
//        validateResetDate(budget);
//        if (resetBudgetRequest.getNewEndDate() != null) budget.setEndDate(LocalDate.parse(formattedResetDate, dateTimeFormatter));
//        if (resetBudgetRequest.getNewAmount() != 0.0) budget.setBudgetAmount(resetBudgetRequest.getNewAmount());
////        budget.setBudgetBalance(budget.getBudgetBalance() + resetBudgetRequest.getNewAmount());
//        return budget;
//    }
//public static void validateResetDate(Budget budget){
//    dateChecker(resetDateFormatter);
//    System.out.println("date reset Formatter "+resetDateFormatter);
//    if (LocalDate.parse(resetDateFormatter, dateTimeFormatter).isBefore(budget.getEndDate()))
//        throw new InvalidDateFormatException("Invalid resetting date");
//    if(LocalDate.parse(resetDateFormatter,dateTimeFormatter).isBefore(budget.getStartDate()))
//        throw new InvalidDateFormatException("Invalid resetting date");
//
//}
//

}
