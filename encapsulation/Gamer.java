package encapsulation;

public class Gamer {
    @Override
    public String toString() {
        return "Gamer{" +
                "nickname='" + nickname + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    private String nickname;
    private boolean isActive;

    public Gamer(String nickname, boolean isActive){
        this.nickname = nickname;
        this.isActive = isActive;
    }

    public String getNickname(){
        return nickname;
    }

    public boolean isActive(){
        return isActive;
    }
}
