import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Member {
    String fn;
    int ag;
    String pt;
    Trainer tr;
    String fa;

    Member(String fn, int ag, String pt, String fa) {
        this.fn = fn;
        this.ag = ag;
        this.pt = pt;
        this.fa = fa;
    }

    @Override
    public String toString() {
        return "Name: " + fn + ", Age: " + ag + ", Membership Type: " + pt +
                ", Trainer: " + tr.fn + ", Access: " + fa;
    }
}

class Trainer {
    String fn;
    boolean ol;

    Trainer(String fn) {
        this.fn = fn;
        this.ol = false;
    }

    @Override
    public String toString() {
        return "Name: " + fn + (ol ? " (On Leave)" : "");
    }
}

public class GymManagementSystem {
    private static final Map<Integer, Member> mbs = new HashMap<>();
    private static final Map<String, Trainer> trs = new HashMap<>();
    private static final String AU = "admin";
    private static final String AP = "password";
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        trs.put("Basic", new Trainer("Kamal Kumar"));
        trs.put("Premium", new Trainer("Jane Smith"));
        trs.put("VIP", new Trainer("Nirupam"));

        boolean running = true;
        while (running) {
            System.out.println("\nGym Management System");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. View Member Access");
            System.out.println("4. View Equipment Restrictions");
            System.out.println("5. Admin Login");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    viewMembers();
                    break;
                case 3:
                    viewMemberAccess();
                    break;
                case 4:
                    viewEquipmentRestrictions();
                    break;
                case 5:
                    adminLogin();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }

    private static void addMember() {
        System.out.print("Enter member fn: ");
        String fn = sc.nextLine();
        System.out.print("Enter member ag: ");
        int ag = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter membership type (Basic, Premium, VIP): ");
        String pt = sc.nextLine();
        String fa = getAccessBasedOnMembership(pt);
        Member m = new Member(fn, ag, pt, fa);
        m.tr = trs.get(pt);
        mbs.put(mbs.size() + 1, m);
        System.out.println("Member added successfully.");
    }

    private static void viewMembers() {
        if (mbs.isEmpty()) {
            System.out.println("No mbs found.");
        } else {
            System.out.println("Members:");
            for (Map.Entry<Integer, Member> e : mbs.entrySet()) {
                System.out.println("ID: " + e.getKey() + ", " + e.getValue());
            }
        }
    }

    private static void viewMemberAccess() {
        if (mbs.isEmpty()) {
            System.out.println("No mbs found.");
        } else {
            System.out.print("Enter member ID to view fa: ");
            int id = sc.nextInt();
            sc.nextLine();
            Member m = mbs.get(id);
            if (m != null) {
                System.out.println("Member fa: " + m.fa);
            } else {
                System.out.println("Member not found.");
            }
        }
    }

    private static void viewEquipmentRestrictions() {
        if (mbs.isEmpty()) {
            System.out.println("No mbs found.");
        } else {
            System.out.print("Enter member ID to view equipment restrictions: ");
            int id = sc.nextInt();
            sc.nextLine();
            Member m = mbs.get(id);
            if (m != null) {
                System.out.println("Equipment restrictions for " + m.fn + " (" +
                        m.pt + "): " + getRestrictedEquipment(m.pt));
            } else {
                System.out.println("Member not found.");
            }
        }
    }

    private static void adminLogin() {
        System.out.print("Enter admin username: ");
        String user = sc.nextLine();
        System.out.print("Enter admin password: ");
        String pass = sc.nextLine();
        if (AU.equals(user) && AP.equals(pass)) {
            adminMenu();
        } else {
            System.out.println("Invalid admin username or password.");
        }
    }

    private static void adminMenu() {
        boolean adminRunning = true;
        while (adminRunning) {
            System.out.println("\nAdmin Menu");
            System.out.println("1. Edit Member Details");
            System.out.println("2. Update Trainer Leave Status");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    editMemberDetails();
                    break;
                case 2:
                    updateTrainerLeaveStatus();
                    break;
                case 3:
                    adminRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void editMemberDetails() {
        if (mbs.isEmpty()) {
            System.out.println("No mbs found.");
            return;
        }
        System.out.print("Enter member ID to edit details: ");
        int id = sc.nextInt();
        sc.nextLine();
        Member m = mbs.get(id);
        if (m != null) {
            System.out.println("Current details: " + m);
            System.out.print("Enter new fn: ");
            String fn = sc.nextLine();
            if (!fn.isEmpty()) {
                m.fn = fn;
            }
            System.out.print("Enter new ag: ");
            String ageInput = sc.nextLine();
            if (!ageInput.isEmpty()) {
                m.ag = Integer.parseInt(ageInput);
            }
            System.out.println("Member details updated successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }

    private static void updateTrainerLeaveStatus() {
        System.out.println("Trainers:");
        for (Map.Entry<String, Trainer> e : trs.entrySet()) {
            System.out.println("Membership Type: " + e.getKey() + ", Trainer: " +
                    e.getValue());
        }
        System.out.print("Enter pt of tr to update leave status: ");
        String pt = sc.nextLine();
        Trainer t = trs.get(pt);
        if (t != null) {
            t.ol = !t.ol;
            System.out.println("Trainer leave status updated successfully.");
            if (t.ol) {
                System.out.print("Enter substitute tr fn: ");
                String subFn = sc.nextLine();
                Trainer sub = new Trainer(subFn);
                for (Member m : mbs.values()) {
                    if (m.tr == t) {
                        m.tr = sub;
                    }
                }
            } else {
                for (Member m : mbs.values()) {
                    if (m.tr.fn.equals("Substitute")) {
                        m.tr = trs.get(m.pt);
                    }
                }
            }
        } else {
            System.out.println("Trainer not found.");
        }
    }

    private static String getAccessBasedOnMembership(String pt) {
        switch (pt) {
            case "Basic":
                return "Access to basic equipment";
            case "Premium":
                return "Access to basic and premium equipment";
            case "VIP":
                return "Access to all equipment";
            default:
                return "No fa";
        }
    }

    private static String getRestrictedEquipment(String pt) {
        switch (pt) {
            case "Basic":
                return "No fa to premium and VIP equipment";
            case "Premium":
                return "No fa to VIP equipment";
            case "VIP":
                return "Access to all equipment";
            default:
                return "Unknown pt";
        }
    }
}