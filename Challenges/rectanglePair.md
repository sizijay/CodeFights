# Description

Among all rectangles that have a perimeter of P, find the dimensions of the one whose area is the largest.

## Example:
```javascript
RectanglePair(100) = [25, 25]
```

    - input integer P
        A positive integer
    - output array.float
        Array of two elements, the length and the width of the rectangle of the maximum area.

## My Solution
* Javascript `25 chars`

``` javascript
RectanglePair = P =>[P=/4,P]
```
* Java

```java
Object RectanglePair(float P) {
    return new double[] { P/=4, P };
}
```
* C#

```csharp
object RectanglePair(float P) {
    return new[] { P/=4, P };
}
```
