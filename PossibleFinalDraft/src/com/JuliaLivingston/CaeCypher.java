package com.JuliaLivingston;



class CaeCipher {

    public void main2(String...s){
        String message;
        StringBuilder encryptedMessage = new StringBuilder();
        String transfer = "";
        int key2 = 0;
        char ch;
        message = transfer;
        for(int i = 0; i < message.length(); ++i){
            ch = message.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + key2);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                encryptedMessage.append(ch);
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key2);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                encryptedMessage.append(ch);
            }
            else {
                encryptedMessage.append(ch);
            }
        }


    }
}



