import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';  
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseUrl='http://localhost:8081/student/api/';

  constructor(private http:HttpClient) 
  {}
    getStudentList():Observable<any>{
      return this.http.get(`${this.baseUrl}`+'get-students');
    }

    createStudent(student: object):Observable<object>{
      return this.http.post(`${this.baseUrl}`+'save-student', student);
    }

    deleteStudent(id: number):Observable<any>{
      return this.http.delete(`${this.baseUrl}delete-student/${id}`, {responseType:'text'});
    }

    getStudent(id: number):Observable<any>{
      return this.http.get(`${this.baseUrl}get-student-by-id/${id}`);
    }

    updateStudent(student: object):Observable<object>{
      return this.http.put(`${this.baseUrl}`+'update-student', student);
    }
   
}
