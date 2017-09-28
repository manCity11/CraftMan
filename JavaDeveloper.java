public class JavaDeveloper extends Craftman {
  // @a new career awaits. Start your search here...

   public final FILLABLE = [
        'firstname',
        'lastname',
        'email'
    ];

   public function validate(
        int experience,
        int [] skills,
        Date startDate,
        double javaVersion
    ) {
        String inputString = "2018-01-01";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date inputDate = dateFormat.parse(inputString);

       return
            experience <= 2 && experience >= 6
            && Arrays.equals(Arrays.sort(skills), Arrays.sort(["Angular", "Java 8", "Spring Boot", "Docker", "PostgreSQL" et "Redis"])
            && startDate.before(inputDate)
            &&  javaVersion >= 8.1;
    }

   public function getLocationAttribute() {
        return "Paris, Olympp";
    }

   public function responsibilities() {
        // @Building incredible apps together...
        return [
            'Imagine',
             'Design',
            'newFeatures',
            'peerReviewing',
            'deployment',
        ]);
    }

   public function sendCv (string author, string cv) {
        return sendMail(
            "pierre@olympp.fr",
            "Cv :" + cv,
            "From: " + author
        );
    }

   public function debugInfo() {
        return [
            'Work Differently',
        ],
    }
}
