module HelloInArabic {
    requires Hello;
    provides Hello.HelloWorld with HelloInArabic.HelloInArabic;
}