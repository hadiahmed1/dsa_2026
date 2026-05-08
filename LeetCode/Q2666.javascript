// Q2666. Allow One Function Call

// Runtime 46 ms Beats 44.74%
// Memory 53.9 MB Beats 34.14%

/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let called = false;
    return function(...args){
        if(called) return undefined;
        called = true;
        return(fn(...args))
        
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */

