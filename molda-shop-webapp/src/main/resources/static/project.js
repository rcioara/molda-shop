angular.module('online-store', ['ngRoute'])
    .service('ProductsService', function($http, $q) {
        this.all = function() {
            var d = $q.defer();
            $http.get("/products").success(function (response) {
                d.resolve(response)
            });
            return d.promise;
        }
    })
    .controller('ProductsController', function(ProductsService) {
        var productsCtrl = this;

        productsCtrl.all = function() {
            ProductsService.all().then(function (response) {
                productsCtrl.list = response
            })
        };

        productsCtrl.all()
    })
    .config(function($routeProvider){
        $routeProvider
            .when('/', {
                controller: 'ProductsController as productsCtrl',
                templateUrl: 'home.html'
            })
            .otherwise({
                redirectTo: '/'
            })
    });