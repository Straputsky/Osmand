package com.osmand;


/**
 * This class is designed to put all to do's and link them with code.
 * The whole methods could be paste or just constants.
 * Do not worry to put ugly code here (just a little piece)
 */
public class ToDoConstants {
	// FIXES for 0.1 versions : 
	// 1. Map tile downloader : 
//	while(!threadPoolExecutor.getQueue().isEmpty()){
//		try {
//			threadPoolExecutor.getQueue().take();
//		} catch (InterruptedException e) {
//		}
//	}
	
	/**
	 * Write activity to show something about authors / donation ....
	 */
	public int DESCRIBE_ABOUT_AUTHORS = 8;
	
	 // TODO ANDROID 
//   31. Translation.
//	     GOT : olga
	
//   42. Revise UI (icons/layouts). Support different devices. Add inactive/focus(!) icon versions.
	
//   37. Get rid of exit button (!). Think about when notification should go & how clear resources if it is necessary
//      DONE : 	
//	     TODO : add to app settings preference (Refresh indexes).
	
//   32. Introduce POI predefined filters (car filter(other-fuel, transportation-car_wash, show-car) and others)
// 		 DONE : back end (POI filter object, save, delete, read) 
//	     TODO : activity to create/edit new index, activity to read both user defined/osm standard, add actions to remove/create

//   33. Build transport locations. Create transport index (transport-stops) (investigate)
//       GOT : Victor	
//		 DONE: Load transport routes in swing. 
//	     TODO: Create transport index, create transport activity


	
//   34. Suppport navigation for calculated route (example of get route from internet is in swing app).
//	     IDEA : Victor have ideas
	
	
	// FUTURE RELEASES
	//   48. Enable change favourite point (for example fav - "car") means last point you left car. It is not static point.
    //   43. Enable poi filter by name (?)
	//   44. Show gps status (possibly open existing gps-compass app (free) or suggest to install it - no sense to write own activity)
	//   45. Get clear <Use internet> settings. Move that setting on top settings screen. 
	//       That setting should rule all activities that use internet. It should ask whenever internet is used 
	//		(would you like to use internet for that operation - if using internet is not checked). 
	//		Internet using now for : edit POI osm, show osm bugs layer, download tiles.
    //   40. Support simple vector road rendering (require new index file) (?)
    //   26. Show the whole street on map (when it is chosen in search activity). Possibly extend that story to show layer with streets. (?)
	//   46. Implement downloading strategy for tiles (do not load 17 zoom, load only 16 for example) - try to scale 15 zoom for 17 (?)
	//   47. Internet connectivity could be checked before trying to use
	
	// BUGS Android
	//  5. Improvement : Implement caching files existing on FS, implement specific method in RM
	//     Introducing cache of file names that are on disk (creating new File() consumes a lot of memory)
	//  6. Improvement postal_code search : replace search city <-> postal_code (show streets for postal_code) 
	
	
	// TODO swing
	// 4. Fix issues with big files (such as netherlands) - save memory (!) - very slow due to transport index !
	// Current result : for big file (1 - task  60-80% time, 90% memory)
	// 1. Download tiles without using dir tiles (?)
	// 5. Improve address indexing (use relations). 
    //	  Use relation "postal_code" to assign postcodes, use relation "a6" (to accumulate streets!), 
	//	  "a3" to read all cities & define boundaries for city (& define that street in city). 
	
	// BUGS Swing
	
	// DONE ANDROID :
    //  36. Postcode search
    //   8. Enable change POI directly on map (requires OSM login)
    //  45. Autozoom feature (for car navigation)
    //  44. Introduce settings presets (car/bicycle/pedestrian/default) - show different icons for car (bigger), possibly change fonts, position
    //  20. Implement save track/route to gpx
	
	// DONE SWING

}
