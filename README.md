## Favorite Sites Application

# Description
FavoriteSites is a Java-based application that helps users keep track of their favorite locations they have visited. Users can log in, add details of their visits, edit or delete them, and share their favorite visits with friends. The application includes features to sort and display visits based on various criteria, enhancing user experience and providing valuable travel insights.

# Features
- User Authentication: Secure login for accessing the application.
- Add a Visit: Users can add details about their visits including country, city, year, season, best feature, comments, and rating.
- Edit and Update Visits: Modify details of previously added visits.
- Delete Visits: Remove visits from the database.
- Display Visits by Criteria:
- Countries with the best feature as food, sorted by rating.
- Visits from a specific year.
- Most visited countries.
- Countries visited only in the spring.
- View Images of Locations: Display images of locations based on visit ID.
- Share Visits: Share visit details with friends.
- View Shared Visits: See visits that have been shared with the user.

# Database Structure
There are 3 database table named 'userinfo' ,'visits' and 'sharedvisits'.
- userinfo : id: Integer (Primary Key), username: String, password: String
- visits : visit_id: Integer (Primary Key), username: String (Foreign Key to userinfo), country_name: String, city_name: String, year_visited: Integer, season_visited: String (autumn/winter/spring/summer), best_feature: String , comments: String, rating: Integer (1-5)
- sharedvisits : id: Integer (Primary Key), username: String (Foreign Key to userinfo), friend-username: String (Foreign Key to userinfo), visit_id: Integer (Foreign Key to visits)
