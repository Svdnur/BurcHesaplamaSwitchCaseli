import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println(" Doğduğunuz ayı giriniz:");
        month = input.nextInt();

        System.out.println("Doğduğunuz günü giriniz :");
        day = input.nextInt();


        switch (month) {

            case 1:


                if (0 < day && 32 > day) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;

            case 2:


                if (0 < day && 29 > day) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;

            case 3:


                if (0 < day && 32 > day) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;

            case 4:


                if (0 < day && 31 > day) {
                    if (day < 22) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
                break;

            case 5:


                if (0 < day && 32 > day) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;

            case 6:


                if (0 < day && 31 > day) {
                    if (day < 22) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
                break;

            case 7:


                if (0 < day && 32 > day) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;

            case 8:


                if (0 < day && 32 > day) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
                break;

            case 9:


                if (0 < day && 31 > day) {
                    if (day < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;

            case 10:


                if (0 < day && 32 > day) {
                    if (day < 22) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;

            case 11:


                if (0 < day && 31 > day) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;

            case 12:


                if (0 < day && 32 > day) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
                break;

        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("Burcunuz : " + burc);
        }

    }
}
