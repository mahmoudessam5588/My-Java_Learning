module HelloInEnglish {
    requires Hello;
    provides Hello.HelloWorld with HelloInEnglish.HelloInEnglish;
}