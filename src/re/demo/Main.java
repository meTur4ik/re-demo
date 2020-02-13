package re.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    // if you open this in Intellij IDEA, you can minimize this huge declaration using button on the left
    //<editor-fold desc="Sample Array">

    // does anybody know, what means absence of access modifier?
    static String[] stringsForTest = new String[] {
            "Mammoth 2",
            "Blinker",
            "FearLeSS",
            "Slug-em-dog",
            "RawSkills",
            "Danqqqqq",
            "3P-own",
            "VileHero",
            "Predator",
            "Freaky Ratbuster",
            "NeoGermal",
            "FireBrang",
            "Fatsy Bear",
            "HolyCombo",
            "ThickSKN",
            "Dark Matter",
            "BuffFreak",
            "HOV",
            "2nd Hand Joe",
            "ThermalMode",
            "Flotsams54",
            "Redneck Giorgio",
            "CodeExia",
            "Roadspike",
            "Mechani-Man",
            "Kazami of Truth",
            "Gbbledgoodk",
            "High Beam",
            "Eye Devil",
            "Swing Setter",
            "Tea Kettle",
            "MrOnsTr",
            "Wrangler Jim",
            "Flint Cast-Iron",
            "Kinged",
            "Lucifurious",
            "Lewd Dice",
            "RZR",
            "LerveDr",
            "Flyswat Briggs",
            "Legacy",
            "Shade Nightman",
            "PP Dubs",
            "Prone",
            "Hemingway Mirmillone",
            "Scooby Did",
            "Stealth",
            "Slinger",
            "Preach Man",
            "Unseen",
            "Crossing Guard",
            "Bad Bond",
            "Force",
            "FRMhndshk",
            "Easy Mac",
            "Sky",
            "SkyGod",
            "Toxic-oxide",
            "Silent",
            "GiddeeUP",
            "Irish Dze",
            "Apex",
            "DragonBlood",
            "Tse Tse Guy",
            "Shay",
            "IceDog",
            "Dallas Foxface",
            "Sloth",
            "Lounge Master",
            "Sprinkle Lovenuts",
            "Sokol",
            "DeathDancer",
            "Zorkle Sporkle",
            "Skool",
            "Pompeii Unicorn",
            "Noise Toy",
            "Flash",
            "Achilles Mountain",
            "Whip Chu",
            "Elektrik",
            "Bad Badminton",
            "Sly Silvermoon",
            "LocKz",
            "THRESHmSTR",
            "Tin Mutt",
            "ReiGnZ",
            "High-Fructose",
            "Sweet Bacon",
            "Coldy",
            "Sepukku",
            "Crazy Rox",
            "Beo",
            "Valley Guardian",
            "1st Degree",
            "Ice",
            "Sw00sh",
            "Bom Crossed",
            "Unleashed",
            "Ba1t",
            "Sick Saurus",
            "Corny",
            "SneakerKid",
            "Mad Viral",
            "Steel",
            "ShadowFax",
            "Clang Glyph",
            "Ex0tic",
            "Hermopolis",
            "xFRST",
            "VPR",
            "ManManMan",
            "Mosquit-No",
            "LyRz",
            "Firedog",
            "ELLerG!c",
            "Lime",
            "German Coach",
            "Hex Panther",
            "Energy",
            "Y0dler",
            "xSTORMx",
            "Blade",
            "WeldMaster",
            "Die Slice",
            "Tunez",
            "Steel Cut Toe",
            "Free Ham",
            "Truth",
            "Forger",
            "Dr. Jam Man",
            "Lskeee",
            "Black Walnut",
            "Seattle Jay",
            "Pexxious",
            "Journeyman",
            "RDTN",
            "Venious",
            "Plegasus",
            "Whip 2T",
            "Grotas",
            "Carrot Joker",
            "Skirble",
            "Sherm",
            "Switch",
            "Solitaire",
            "Gro",
            "Hobo Samurai",
            "Prof. Smirk",
            "Indestructible Potato",
            "Good William",
            "GuTzd",
            "Kamikaze Grandma",
            "Infinite Hole",
            "Are Ess Tee",
            "Badger the Burglar",
            "Sw33per",
            "Sir Squire",
            "Mauve Cactus",
            "Hidden Tree",
            "Deano",
            "Bruh",
            "AxelRoad",
            "Uncle Buddy",
            "Fadey",
            "Goldman",
            "Copilot",
            "Z-Boy",
            "Fl00d",
            "Bones",
            "DZE",
            "Danger Menace",
            "Vermilion",
            "Muzish",
            "Hang 11",
            "TrinitySoul",
            "Cooger",
            "Delicious Wing",
            "BlackExcalibur",
            "Kazmii",
            "Doz",
            "Risen",
            "AirportHobo XD",
            "Prez Dog",
            "ShadowDancer",
            "Cumulo",
            "Baked ZD"
    };
    //</editor-fold>

    public static void main(String[] args) {
        usernameCheck();
        //noCompiledVsCompiledTime();
        //compiledEmailGroups();
        //noCompileEmail();
    }

    public static void usernameCheck() {    //space here ↓
        boolean matches = Pattern.matches("[\\w\\. -]{2,15}", ".asd3S");
        System.out.println(matches);
    }

    public static void noCompiledVsCompiledTime() {

        long startNoCompiledTime = System.currentTimeMillis();

        for (String str : stringsForTest) {
            boolean matches = Pattern.matches("[\\w\\. -]{2,15}", str);
        }

        long elapsedNoCompiledTime = System.currentTimeMillis() - startNoCompiledTime;

        // to shame there is no string interpolation in Java, so those outputs are unreadable at first look
        System.out.println(String.format("elapsed time without compiling: %d", elapsedNoCompiledTime));


        long startCompiledTime = System.currentTimeMillis();

        Pattern p = Pattern.compile("[\\w\\. -]{2,15}");
        for (String str : stringsForTest) {
            boolean matches = p.matcher(str).matches();
        }

        long elapsedCompiledTime = System.currentTimeMillis() - startCompiledTime;
        System.out.println(String.format("elapsed time with compiling: %d", elapsedCompiledTime));
    }

    public static void noCompileEmail() {
        boolean matches = Pattern.matches("^([\\w\\-\\.]+)@([\\w]+)\\.(\\w{0,5})$", "a.sd-ee@sd.com");
        System.out.println(matches);
    }

    // as seen here, compiling also gives way better API when you want to extract groups from RegEx
    public static void compiledEmailGroups() {
        Pattern p = Pattern.compile("^([\\w\\-\\.]+)@([\\w]+)\\.(\\w{0,5})$");
        Matcher m = p.matcher("a.sd1-ee@sd.com");
        if (m.matches()) {
            System.out.println("before `@`: " + m.group(1));
            System.out.println("from `@` to `.`: " + m.group(2));
            System.out.println("after `.`: " + m.group(3));
        }
    }
}
