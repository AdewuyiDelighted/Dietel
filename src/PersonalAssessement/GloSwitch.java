package PersonalAssessement;

import java.util.Scanner;

public class GloSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Data
                2. Borrow Credit or Data
                3. Buy Recharge
                """);
        int glo = scanner.nextInt();
        switch (glo) {
            case 1: {
                System.out.println("""
                        1.Buy Data 
                        2.Gift Data Plan
                        3.Share Data Plan""");
            }
                int data = scanner.nextInt();
                switch (data) {
                    case 1:
                        System.out.println("""
                                1.Proceed auto renew
                                2.proceed one-off""");
                        int autoRenew = scanner.nextInt();
                        switch (autoRenew) {
                            case 1:
                                System.out.println("""
                                        1.Mini plan
                                        2.Monthly plan
                                        3.Mega plan
                                        4.Social plan
                                        5.Night plan and weekend plan
                                        """);

                                int planOne = scanner.nextInt();
                                switch (planOne) {
                                    case 1:
                                        System.out.println("""
                                                1.#100 = 150Mb 30days
                                                2.#200 = 350MB 1 day
                                                3.#500 = 1.8GB 1 day                                                  
                                                4.#50 = 50Mb 1 day
                                                """);
                                        break;
                                }

                            case 2: {
                                System.out.println("""
                                        1.#1000 = 3.9GB 30days
                                        2.#1500 = 7.5GB 30days
                                        3.#2000 = 9.2GB 30days
                                        4.#2500 = 10GB 30days""");
                                break;
                            }
                            case 3: {
                                System.out.println("""
                                        1.#10000 = 50GB 30days
                                        2.#15000 = 93GB 30days
                                        3.#20000 = 138GB 30days""");
                                break;
                            }
                            case 4: {
                                System.out.println("""
                                        1.#25 = 100MB 1day
                                        2.#50 = 2000MB 7days
                                        3.#100 = 500MB 30days""");
                                break;
                            }
                            case 5: {
                                System.out.println("""
                                        1.#25 = 250MB 1day(12am-5am)
                                        2.#50 = 500MB 1 day(12am-5am)
                                        3.#100 = 1GB 5days(12am-5am)
                                        4.#200 = 1.2GB (Sun)
                                        5.#500 = 3GB(Sat-Sun)""");
                                break;
                            }
//                            case 2: {
//                                System.out.println("""
//                                        1.Mini Plan
//                                        2.Monthly Plan
//                                        3.Social Bundle
//                                        4.Night and Weakend
//                                        """); break;


//                                case 2:
//                                    System.out.println("""
//                                            1.Mini plan
//                                            2.Monthly plan
//                                            3.Mega plan""");
//                                    break;
//                                case 3:
//                                    System.out.println("""
//                                            1.Share
//                                            2.Unshare""");
//                                    break;
                            }
                            break;
                        }

                    case 2:

                }
            }

        }

