import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-test-app';
  mvTitle = 'Top 4 Movies';
  movies: Movie[] = [{ movieTitle: 'Zootopia', director: 'Byron Howard, Rich Moore', cast: 'Idris Elba, Ginnifer Goodwin, Jason Bateman', releaseDate: 'March 4, 2016' },
  { movieTitle: 'Batman v Superman: Dawn of Justice', director: 'Zack Snyder', cast: 'Ben Affleck, Henry Cavill, Amy Adams', releaseDate: 'March 25, 2016' },
  { movieTitle: 'Captain America: Civil War', director: 'Anthony Russo, Joe Russo', cast: 'Scarlett Johansson, Elizabeth Olsen, Chris Evans', releaseDate: 'May 6, 2016' },
  { movieTitle: 'X-Men: Apocalypse', director: 'Bryan Singer', cast: 'Jennifer Lawrence, Olivia Munn, Oscar Isaac', releaseDate: 'May 27, 2016' },
  ];
  items: Item[] = [{name:'One', val:1},{name:'Two', val:2},{name:'Three', val:3}];
  selectedValue:string='One';

  username:string = "John Smith";

}
class Movie {
  movieTitle: string;
  director: string;
  cast: string;
  releaseDate: string;
}
class Item {
  name: string;
  val: number;
}
