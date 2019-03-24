import { Component,  OnInit } from '@angular/core';
import { trigger,animate,style,transition,keyframes} from '@angular/animations';
import { Restaurant } from './restaurant';
import { ApiService } from './core/api.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  animations:[
   trigger("moveInLeft",[
      transition("void=> *",[style({transform:"translateX(300px)"}),
        animate(200,keyframes([
         style({transform:"translateX(300px)"}),
         style({transform:"translateX(0)"})
 
          ]))]),
transition("*=>void",[style({transform:"translateX(0px)"}),
        animate(100,keyframes([
         style({transform:"translateX(0px)"}),
         style({transform:"translateX(300px)"})
 
          ]))])    
     
    ])
]
})

export class AppComponent implements OnInit {
  
  title = 'restaurant-app';
  restaurants : Restaurant[];

  constructor(private apiService: ApiService) { }

  ngOnInit(){
    this.getRestaurant();
  }

  getRestaurant(){
    this.apiService.getRestaurant$()
    .subscribe(restaurants => this.restaurants = restaurants);
  }

}
