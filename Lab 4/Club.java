package Upes;

class Club {
    private static String clubName = "Elite Club";
    private String memberName;

    public Club(String memberName) {
        this.memberName = memberName;
    }

    public static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    public void displayMemberDetails() {
        System.out.println("Club Name: " + clubName + ", Member Name: " + memberName);
    }

    public static void main(String[] args) {
        Club member1 = new Club("Alice");
        Club member2 = new Club("Bob");
        Club member3 = new Club("Charlie");

        // Displaying club name
        Club.displayClubName();

        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();
    }
}
