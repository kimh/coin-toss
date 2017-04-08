# Rscript draw.R
(x <- read.table("/tmp/coin-toss-result.txt", header=T))
png("mygraphic.png")
plot(x$avg, type="l")
dev.off()
browseURL("mygraphic.png")
