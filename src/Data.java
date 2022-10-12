public class Data {

    private static final String ALLOWED_SYMBOLS = "0123456789_qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

    public static boolean checkPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if(login==null ||  login.isEmpty() || login.isBlank() ){
            throw new WrongLoginException("Не задан логин");
        }

        if(login.length()>20){
            throw new WrongLoginException("Длина логина не должна превышать 20 символов");
        }

        String wrongSymbols="";
        for (int i = 0; i < login.length(); i++) {
            String symbol = login.substring(i,i+1);
            if(! ALLOWED_SYMBOLS.contains(symbol)){
                wrongSymbols = wrongSymbols + symbol;
            }
        }
        if(wrongSymbols.length()>0){
            throw new WrongLoginException("Логин содержит недопустимые символы "+wrongSymbols);
        }

        if(password==null ||  password.isEmpty() || password.isBlank() ){
            throw new WrongPasswordException("Не задан пароль");
        }

        if(password.length()>20){
            throw new WrongPasswordException("Длина пароля не должна превышать 20 символов");
        }

        wrongSymbols="";
        for (int i = 0; i < password.length(); i++) {
            String symbol = password.substring(i,i+1);
            if(! ALLOWED_SYMBOLS.contains(symbol)){
                wrongSymbols = wrongSymbols + symbol;
            }
        }
        if(wrongSymbols.length()>0){
            throw new WrongPasswordException("Пароль содержит недопустимые символы "+wrongSymbols);
        }

        if( ! password.equals(confirmPassword)){
            throw new WrongPasswordException("Подтверждение пароля не совпадает с паролем");
        }

        return true;
    }



}
