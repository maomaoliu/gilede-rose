# Tasking

1 当给定商品名称时，能够获得商品的`SellIn`值和`Quality`值
2 对于给定商品，对商品进行更新时，
    SellIn = SellIn - 1
2.1 若商品是Backstage，
    - 如果 SellIn > 10，quality 不变
    - 如果 10 >= SellIn > 5, quality = quality + 2 > 50 ? 50 : quality + 2
    - 如果 5 >= SellIn > 0, quality = quality + 3 > 50 ? 50 : quality + 3
    - 如果 SellIn <= 0, quality = 0
2.2 若商品不是Backstage，
    - 如果 SellIn <= 0, quality = quality - 2 < 0 ? 0 : quality - 2
    - 如果 SellIn > 0, quality = quality - 1 < 0 ? 0 : quality - 1