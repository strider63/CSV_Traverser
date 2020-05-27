package app.RowObjects;

/**
 * @author Dom S. - 2020
 * owid-covid-data.csv
 */
<<<<<<< HEAD
public class OWIDnewData {
=======
public class NewDeathData {
>>>>>>> master
    String isoCode;
    String location;
    String date;
    int confirmed;
    int newDeaths;
    int deaths;

<<<<<<< HEAD
    public OWIDnewData(String[] data){
=======
    public NewDeathData(String[] data){
>>>>>>> master
        isoCode = data[0];
        location = data[1];
        date = data[2];
        confirmed = Integer.parseInt(data[3]);
        newDeaths = Integer.parseInt(data[6]);
        deaths = Integer.parseInt(data[5]);
    }

<<<<<<< HEAD
    public static OWIDnewData[] sortByConfirmed(OWIDnewData[] deathData, boolean lowToHigh) {
        OWIDnewData temp;
=======
    public static NewDeathData[] sortByConfirmed(NewDeathData[] deathData, boolean lowToHigh) {
        NewDeathData temp;
>>>>>>> master
        if (lowToHigh) {
            // INNEFICIENt SELECTION SORT ALG
            for (int i = 0; i < deathData.length - 1; i++) {	
                //initialize the smallest_index    
                int smallest_index = i;		
                //inner loop locate smallest 
                for(int j = i + 1; j < deathData.length; j++) {
                    if(deathData[j].confirmed() < deathData[smallest_index].confirmed()) smallest_index = j;
                }	
                // 3 part swap between loops   
                temp = deathData[ smallest_index ];
                deathData[ smallest_index ] = deathData[i];		
                deathData[ i ] = temp;
            }// close the otter loop
        } else {
            for (int i = 0; i < deathData.length - 1; i++) {	
                //initialize the smallest_index    
                int largest_index = i;		
                //inner loop locate smallest 
                for(int j = i + 1; j < deathData.length; j++) {
                    if(deathData[j].confirmed() > deathData[largest_index].confirmed()) largest_index = j;
                }	
                // 3 part swap between loops   
                temp = deathData[largest_index];
                deathData[largest_index] = deathData[i];		
                deathData[i] = temp;
            } 
        }
        System.out.println("Least reported cases: " + deathData[0].isoCode() + " " + deathData[0].location() + " - " + deathData[0].confirmed());
        System.out.println("Most reported cases: " + deathData[deathData.length  - 1].isoCode() + " " + deathData[deathData.length - 1].location() + " - " + deathData[deathData.length - 1].confirmed());
        return deathData;
    }

<<<<<<< HEAD
    public static OWIDnewData[] sortByDeaths(OWIDnewData[] deathData, boolean lowToHigh) {
        OWIDnewData temp;
=======
    public static NewDeathData[] sortByDeaths(NewDeathData[] deathData, boolean lowToHigh) {
        NewDeathData temp;
>>>>>>> master
        if (lowToHigh) {
            // INNEFICIENt SELECTION SORT ALG
            for (int i = 0; i < deathData.length - 1; i++) {	
                //initialize the smallest_index    
                int smallest_index = i;		
                //inner loop locate smallest 
                for(int j = i + 1; j < deathData.length; j++) {
                    if(deathData[j].deaths() < deathData[smallest_index].deaths()) smallest_index = j;
                }	
                // 3 part swap between loops   
                temp = deathData[ smallest_index ];
                deathData[ smallest_index ] = deathData[i];		
                deathData[ i ] = temp;
            }// close the otter loop
        } else {
            for (int i = 0; i < deathData.length - 1; i++) {	
                //initialize the smallest_index    
                int largest_index = i;		
                //inner loop locate smallest 
                for(int j = i + 1; j < deathData.length; j++) {
                    if(deathData[j].deaths() > deathData[largest_index].deaths()) largest_index = j;
                }	
                // 3 part swap between loops   
                temp = deathData[largest_index];
                deathData[largest_index] = deathData[i];		
                deathData[i] = temp;
            } 
        }
        System.out.println("Least deaths: " + deathData[0].isoCode() + " " + deathData[0].location() + " - " + deathData[0].deaths());
        System.out.println("Most deaths: " + deathData[deathData.length  - 1].isoCode() + " " + deathData[deathData.length - 1].location() + " - " + deathData[deathData.length - 1].deaths());
        return deathData;
    }

    public int deaths(){
        return deaths;
    }


    public String isoCode(){
        return isoCode;
    }

    public int newDeaths(){
        return newDeaths;
    }

    public int confirmed(){
        return confirmed;
    }

    public String date(){
        return date;
    }

    public String location() {
        return location;
    }
}