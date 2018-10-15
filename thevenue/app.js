/// <reference path="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"/>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
var myApp = angular.module('myModule',[]);

myApp.controller('myController',myController);

function myController($scope) {
   $scope.message = "Angular JS Appilcatino "
}
