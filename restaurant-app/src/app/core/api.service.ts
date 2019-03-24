import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { throwError as ObservableThrowError, Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Restaurant } from '../restaurant';

@Injectable()
export class ApiService {

  private restaurantURL = 'http://localhost:8085/restaurant';

  constructor(
    private http: HttpClient
  ) { }

  // GET list of public, future events
  getRestaurant$(): Observable<Restaurant[]> {
    return this.http
      .get<Restaurant[]>(this.restaurantURL)
      .pipe(
        catchError((error) => this._handleError(error))
      );
  }

  // // GET an event by ID (login required)
  // getEventById$(id: string): Observable<Restaurant> {
  //   return this.http
  //     .get<Restaurant>(`${ENV.BASE_API}restaurant/${id}`, {
  //       headers: new HttpHeaders().set('Authorization', this._authHeader)
  //     })
  //     .pipe(
  //       catchError((error) => this._handleError(error))
  //     );
  // }

  // // GET RSVPs by event ID (login required)
  // getRsvpsByEventId$(eventId: string): Observable<RsvpModel[]> {
  //   return this.http
  //     .get<RsvpModel[]>(`${ENV.BASE_API}event/${eventId}/rsvps`, {
  //       headers: new HttpHeaders().set('Authorization', this._authHeader)
  //     })
  //     .pipe(
  //       catchError((error) => this._handleError(error))
  //     );
  // }

  private _handleError(err: HttpErrorResponse | any): Observable<any> {
    const errorMsg = err.message || 'Error: Unable to complete request.';
    if (err.message && err.message.indexOf('No JWT present') > -1) {
      //this.auth.login();
    }
    return ObservableThrowError(errorMsg);
  }

}