public class AddBorder {
    //Given a rectangular matrix of characters, add a border of asterisks(*) to it.
    String[] addBorder(String[] picture) {

        String[] newPic = new String[picture.length+2];
        String border = "";

        for(int i = 0; i < picture[0].length()+2; i++){
            border += '*';
        }

        newPic[0] = border;
        newPic[newPic.length-1] = border;

        for(int j = 0; j < picture.length; j++){
            newPic[j + 1] = '*' + picture[j] + '*';
        }
        return newPic;
    }
}
