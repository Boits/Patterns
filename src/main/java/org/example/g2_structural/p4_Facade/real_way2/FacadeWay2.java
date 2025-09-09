package org.example.g2_structural.p4_Facade.real_way2;

public class FacadeWay2 {
    /*
    1) Веб-приложения и слои абстракции
    2) Интеграция с внешними системами
    3) Работа с микросервисами

    public class UserFacade {
        private AuthenticationService authenticationService;
        private ProfileService profileService;
        private TransactionHistoryService transactionHistoryService;

        public UserFacade() {
            authenticationService = new AuthenticationService();
            profileService = new ProfileService();
            transactionHistoryService = new TransactionHistoryService();
        }

        public UserFullInfo getUserFullInfo(String userId) {
            User user = authenticationService.getUser(userId);
            Profile profile = profileService.getProfile(userId);
            List<Transaction> transactions = transactionHistoryService.getTransactions(userId);

            return new UserFullInfo(user, profile, transactions);
        }
    }

     */

}
